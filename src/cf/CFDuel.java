package cf;

import java.io.*;
import java.util.*;

public class CFDuel {
    public static void main(String [ ] args) {
        SimonScanner sc = new SimonScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        a: while (t-->0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean only = false;
            for (int i = 0; i < n; i++)  {a[i] = sc.nextInt();if(a[i] == 0) only = true;}
            if (!only) {
                out.println("YES");
                continue;
            }
            for (int i = 1; i < n; i++) {
                if (a[i] == 0 && a[i - 1] == 0) {
                    out.println("YES");
                    continue a;
                }
            }
            out.println("NO");
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