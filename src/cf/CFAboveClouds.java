package cf;

import java.io.*;
import java.util.*;

public class CFAboveClouds {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t-->0) {
            int l = sc.nextInt();
            String s = sc.next();
            boolean flag = false;
            for (int i = 1; i < s.length() - 1; i++) {
                if ((s.substring(0, i) + s.substring(i + 1)).contains(s.substring(i, i+1))) {
                    flag = true;
                    out.println("Yes");
                    break;
                }
            }
            if (!flag) out.println("No");
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