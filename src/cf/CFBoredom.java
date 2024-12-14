package cf;
import java.io.*;
import java.util.*;
public class CFBoredom {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        long [] ar = new long[100001];
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int x = sc.nextInt();
            ar[x] += x;
        }

        for (int i = 2;i < ar.length; i++) ar[i] = Math.max(ar[i] + ar[i - 2], ar[i - 1]);
        System.out.println(ar[100000]);
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