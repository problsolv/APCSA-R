import java.io.*;
import java.util.*;

public class CFBooks {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int start = 0, end = 0, sum = 0, maxBooks = 0;
        while (end < n) {
            while (end < n && sum + a[end] <= t) {
                sum += a[end];
                end++;
            }
            maxBooks = Math.max(maxBooks, end - start);
            while (start < n && sum > t) {
                sum -= a[start];
                start++;
            }
        }
        System.out.println(maxBooks);
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