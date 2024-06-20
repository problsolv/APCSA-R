package cf;
import java.io.*;
import java.util.*;
public class CFCritics {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[] t = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(t);
            System.out.println(t[1] + t[2] >= 10 ? "YES" : "NO");
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