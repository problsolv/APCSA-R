package cf;

import java.io.*;
import java.util.*;

public class CFMountains {
    public static void main(String [ ] args) {
        SimonScanner sc = new SimonScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-->0) {
            int l = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[l];
            for (int i = 0; i < l; i++) {
                a[i] = sc.nextInt();
            }
            int ans = 0, c = 0;
            for (int i = 0; i < l; i++) {
                c = a[i] == 0 ? c + 1 : 0;
                if (c >= k) {
                    ans++;
                    i++;
                    c = 0;
                }
            }
            out.println(ans);
        }
        out.close();
    }
    static class SimonScanner {
        BufferedReader br;
        StringTokenizer st;
        SimonScanner(InputStream i) { br = new BufferedReader(new InputStreamReader(i)); }
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