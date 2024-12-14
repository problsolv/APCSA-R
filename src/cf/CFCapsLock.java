package cf;
import java.io.*;
import java.util.StringTokenizer;
public class CFCapsLock {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String s = sc.next(), r;
        r = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        if (!s.substring(1).equals(s.substring(1).toUpperCase()))
            r = s;
        if (s.equals(s.toUpperCase())) r = s.toLowerCase();
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