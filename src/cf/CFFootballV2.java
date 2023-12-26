package cf;
import java.io.*;
import java.util.*;

public class CFFootballV2 {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt(), o = 0;
        String[] s = new String[a];
        for (int i = 0; i < a; i++) {
            s[i] = sc.next();
        }
        String d = "";
        for (int i = 0; i < a; i++) {
            if (s[0].equals(s[i])) o++;
            else {
                d = s[i];
                o--;
            }
        }
        System.out.println(o > 0 ? s[0] : d);
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