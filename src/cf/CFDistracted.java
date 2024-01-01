package cf;
import java.io.*;
import java.util.*;
public class CFDistracted {
    static FastScanner sc = new FastScanner(System.in);
    static void solve() {
        int n = sc.nextInt();
        String s = sc.next();

        for (char c = 'A'; c <= 'Z'; c++) {
            int f = n, l = -1;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == c) {
                    f = Math.min(f, i);
                    l = Math.max(l, i);
                }
            }
            for (int i = f; i <= l; i++) {
                if (s.charAt(i) != c) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }

    public static void main(String [ ] args) {
        int a = sc.nextInt();
        while (a-- > 0) solve();
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