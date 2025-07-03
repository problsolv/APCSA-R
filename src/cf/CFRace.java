package cf;

import java.io.*;
import java.util.*;

public class CFRace {
    public static void main(String [ ] args) {
        SimonScanner sc = new SimonScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-->0) {
            int a = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
            out.println(a < x == a < y ? "YES" : "NO");
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