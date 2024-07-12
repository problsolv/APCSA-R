package cf;

import java.io.*;
import java.util.*;
public class CFChewbacca {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String s = sc.next();
        String f = s.substring(0, 1);
        s = s.substring(1);
        if (Integer.parseInt(f) > 4 && Integer.parseInt(f) != 9) {
            f = Integer.toString(9 - Integer.parseInt(f));
        }
        for (int i = 0; i < s.length(); i++) {
            if (Integer.parseInt(s.substring(i, i + 1)) > 4) {
                s = s.substring(0, i) + (9 - Integer.parseInt(s.substring(i, i + 1))) + s.substring(i + 1);
            }
        }
        pw.println(f + s);
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