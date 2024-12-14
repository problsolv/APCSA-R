package cf;
import java.io.*;
import java.util.StringTokenizer;
public class CFSnake {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int l = sc.nextInt(), w = sc.nextInt();
        boolean ib = true, ob = true;
        for (int i = 0; i < l; i++) {
            if (ob) {
                for (int j = 0; j < w; j++) {
                    out.print("#");
                }
            }
            else {
                if (ib) {
                    for (int j = 1; j < w; j++) {
                        out.print(".");
                    }
                    out.print("#");
                }
                else {
                    out.print("#");
                    for (int j = 1; j < w; j++) {
                        out.print(".");
                    }
                }
                ib = !ib;
            }
            out.println();
            ob = !ob;
        }
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