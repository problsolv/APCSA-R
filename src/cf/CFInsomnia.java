package cf;
import java.io.*;
import java.util.StringTokenizer;
public class CFInsomnia {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int k = sc.nextInt(), l = sc.nextInt(), m = sc.nextInt(), n = sc.nextInt(), d = sc.nextInt();
        int v = 1, h = 0;
        while (v <= d) {
            if (v % k == 0 || v % l == 0 || v % m == 0 || v % n == 0) h++;
            v++;
        }
        if (k == 1 || l == 1 || m == 1 || n == 1) h = d;
        out.println(h);
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