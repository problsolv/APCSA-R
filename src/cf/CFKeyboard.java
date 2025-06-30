package cf;
import java.io.*;
import java.util.*;

public class CFKeyboard {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String s = sc.next(), l = sc.next();
        char[] c = "qwertyuiopasdfghjkl;zxcvbnm,./".toCharArray();
        for (char d : l.toCharArray()) {
            for (int i = 0; i < c.length; i++) {
                if (c[i] == d) {
                    if (s.equals("R")) out.print(c[i - 1]);
                    else out.print(c[i + 1]);
                    break;
                }
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