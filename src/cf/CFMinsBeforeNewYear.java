package cf;

import java.io.*;
import java.util.*;
public class CFMinsBeforeNewYear {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int h = sc.nextInt() * 60, m = sc.nextInt();
            pw.println(1440 - h - m);
        }
        pw.close();
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