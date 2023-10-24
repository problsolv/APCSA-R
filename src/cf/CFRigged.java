package cf;
import java.io.*;
import java.util.*;
public class CFRigged {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt();
            int[] s = new int[109], e = new int[109];

            for (int j = 0; j < n; j++) {
                s[j] = sc.nextInt();
                e[j] = sc.nextInt();
            }

            for (int j = 1; j < n; j++) {
                if (s[j] >= s[0] && e[j] >= e[0]) {
                    s[0] = -1;
                    break;
                }
            }
            System.out.println(s[0]);
        }
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