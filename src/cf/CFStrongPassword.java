package cf;

import java.io.*;
import java.util.*;
public class CFStrongPassword {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        while (n --> 0) {
            String s = sc.next();
            boolean flag = true;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    flag = false;
                    String t = (char)(s.charAt(i) - 1) + "";
                    if (s.charAt(i) == 'a') t = "b";
                    out.println(s.substring(0, i) + t + s.substring(i));
                    break;
                }
            }
            if (flag) {
                if (s.charAt(0) == 'a') out.println("b" + s);
                else out.println("a" + s);
            }
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
