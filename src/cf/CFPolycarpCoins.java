package cf;

import java.io.*;
import java.util.*;
public class CFPolycarpCoins {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int n = sc.nextInt(), x = n / 3, y = n % 3;
            if (y == 0) {
                System.out.println(x + " " + x);
            } else if (y == 1) {
                System.out.println((x + 1) + " " + x);
            } else {
                System.out.println(x + " " + (x + 1));
            }
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