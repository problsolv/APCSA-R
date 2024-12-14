package cf;
import java.io.*;
import java.util.*;
public class CFChoosingTeams {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int c = 0, n = sc.nextInt(), k = 5 - sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (k >= sc.nextInt()) c++;
        }
        System.out.println(c / 3);
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