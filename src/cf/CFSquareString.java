package cf;

import java.io.*;
import java.util.*;
public class CFSquareString {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.length() % 2 == 1) {
                System.out.println("NO");
                continue;
            }
            if (s.substring(0, s.length() / 2).equals(s.substring(s.length() / 2))) System.out.println("YES");
            else System.out.println("NO");
        }
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