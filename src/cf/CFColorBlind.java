package cf;

import java.io.*;
import java.util.*;

public class CFColorBlind {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        while (n-->0) {
            int a = sc.nextInt();
            String s = sc.next().replace("G", "B"), t = sc.next().replace("G", "B");
            if (s.equals(t)) out.println("YES");
            else out.println("NO");
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