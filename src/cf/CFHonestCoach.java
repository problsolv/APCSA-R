package cf;

import java.io.*;
import java.util.*;

public class CFHonestCoach {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        while (n-->0) {
            int m = sc.nextInt();
            int[] arr = new int[m];
            for (int i = 0; i < m; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int min = Integer.MAX_VALUE;
            for (int i = 1; i < m; i++) {
                min = Math.min(min, arr[i] - arr[i - 1]);
            }
            out.println(min);
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