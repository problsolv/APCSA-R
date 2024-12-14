package cf;
import java.io.*;
import java.util.*;
public class CFMishka {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt(), r = 0;
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt(), c = sc.nextInt();
            if (b > c) r++;
            else if (b < c) r--;
        }
        if (r == 0) {
            System.out.println("Friendship is magic!^^");
            return;
        }
        System.out.println((r > 0) ? "Mishka" : "Chris");
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