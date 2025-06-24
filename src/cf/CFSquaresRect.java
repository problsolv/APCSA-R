package cf;

import java.io.*;
import java.util.*;
public class CFSquaresRect {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = sc.nextInt();
        while (a-->0) {
            int[] l = new int[3], b = new int[3];
            for (int i = 0; i < 3; i++) {
                l[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }
            if (l[0] == l[1] && l[1] == l[2] && l[1] == b[0] + b[1] + b[2] || b[0] == b[1] && b[1] == b[2] && b[1] == l[0] + l[1] + l[2] || l[1] == l[2] && l[0] + l[2] == b[0] && b[0] == b[1] + b[2] || b[1] == b[2] && b[0] + b[2] == l[0] && l[0] == l[1] + l[2]) out.println("YES");
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