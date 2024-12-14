package cf;
import java.io.*;
import java.util.*;
public class CFNewYearParty {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int p = sc.nextInt(), t = 240 - sc.nextInt(), tot = 0;
        if (t < 0) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i <= p; i++) {
            t -= 5 * (i + 1);
            tot++;
            if (t < 0) break;
        }
        System.out.println(tot - 1);

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