package cf;

import java.io.*;
import java.util.*;
public class CFFenceV2 {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int[] a = new int[sc.nextInt()];
        int ind = 0, x = sc.nextInt(), sum = 0, max;
        for (int i = 0; i < x; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        max = sum;
        for (int i = x; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i] - a[i - x];
            if (sum < max) {
                max = sum;
                ind = i - x + 1;
            }
        }
        System.out.println(ind + 1);
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