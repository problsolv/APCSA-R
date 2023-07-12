package cf;
import java.io.*;
import java.util.StringTokenizer;
public class CFGames {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int[][] g = new int[sc.nextInt()][2];
        for (int i = 0; i < g.length; i++) for (int j = 0; j < g[0].length; j++) g[i][j] = sc.nextInt();
        int c = 0;
        for (int[] o : g) for (int[] i : g) if (o[0] == i[1]) c++;
        out.println(c);
        out.close();
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner(InputStream i) { br = new BufferedReader(new InputStreamReader(i)); }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        double nextDouble() { return Double.parseDouble(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }
}