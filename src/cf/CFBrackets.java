package cf;

import java.io.*;
import java.util.StringTokenizer;

public class CFBrackets {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-->0) {
            int l = sc.nextInt(), ans = 0, hasOpen = 0;
            String st = sc.next();
            for (int i = 0; i < l; i++) {
                if (st.charAt(i) == '(') hasOpen++;
                else {
                    if (hasOpen > 0) hasOpen--;
                    else ans++;
                }
            }
            assert hasOpen == ans : "Not ok";
            out.println(ans);
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