package cf;
import java.io.*;
import java.util.*;
public class CFNewYearTransportation {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int[] a = new int[sc.nextInt() - 1];
        int t = sc.nextInt() - 1;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int i = 0;
        while (i < t) {
            i += a[i];
        }
        System.out.println(i == t ? "YES" : "NO");
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