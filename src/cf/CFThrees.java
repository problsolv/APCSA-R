package cf;
import java.io.*;
import java.util.*;
public class CFThrees {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        ArrayList<Integer> n = new ArrayList<>();
        for (int i = 1; i <= 1666; i++) if (i % 3 != 0 && i % 10 != 3) n.add(i);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) System.out.println(n.get(sc.nextInt() - 1));
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