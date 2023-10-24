package cf;
import java.io.*;
import java.util.*;
public class CFIncreasingSequence {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int[] b = new int[sc.nextInt()], c = new int[b.length];
            for (int j = 0; j < b.length; j++) b[j] = sc.nextInt();
            if (b[0] == 1) c[0] = 2;
            else c[0] = 1;
            for (int j = 1; j < b.length; j++) {
                if (b[j] == c[j - 1] + 1) c[j] = c[j - 1] + 2;
                else c[j] = c[j - 1] + 1;
            }
            System.out.println(c[c.length - 1]);
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