package cf;
import java.io.*;
import java.util.StringTokenizer;
public class CFHorseshoe {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int[] s = new int[4];
        int r = 0;
        for (int i = 0; i < s.length; i++) s[i] = sc.nextInt();
        for (int i = 0; i < s.length - 1; i++) {
            int c = 0;
            for (int j = i; j < s.length; j++) if(s[i] == s[j]) c++;
            if (c > 1) r++;
        }
        out.println(r);
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