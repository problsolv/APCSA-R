package cf;
import java.io.*;
import java.util.*;
public class CFCheapTravel {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), t = 0;
        while (n > 0) {
            if (n != 1) {
                if ((double) b / m < a) {
                    if (n * a < b) {
                        t += a;
                        n--;
                    }
                    else {
                        t += b;
                        n -= m;
                    }
                } else {
                    t += a;
                    n--;
                }
            }
            else {
                t += Math.min(b, a);
                break;
            }
        }
        System.out.println(t);
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