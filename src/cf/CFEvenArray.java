package cf;
import java.io.*;
import java.util.*;
public class CFEvenArray {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int c = sc.nextInt(), w1 = 0, w2 = 0;
            for (int j = 0; j < c; j++) {
                int cc = sc.nextInt();
                if (j % 2 == 0 && cc % 2 == 1) w1++;
                if (j % 2 == 1 && cc % 2 == 0) w2++;
            }
            System.out.println(w1 == w2 ? (w1 + w2) / 2 : -1);
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