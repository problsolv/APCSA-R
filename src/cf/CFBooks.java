package cf;

import java.io.*;
import java.util.*;
public class CFBooks {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        int[] a = new int[sc.nextInt()];
        int t = sc.nextInt();
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();

        int start = 0, sum = 0, max = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            while (sum > t) {
                sum -= a[start];
                start++;
            }
            max = Math.max(max, i - start + 1);
        }
        System.out.println(max);
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