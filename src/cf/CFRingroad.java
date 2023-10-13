package cf;
import java.io.*;
import java.util.*;
public class CFRingroad {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        long n = sc.nextInt(), t = 0;
        int[] m = new int[sc.nextInt()];
        for (int i = 0; i < m.length; i++) m[i] = sc.nextInt();
        t += m[0] - 1;
        for (int i = 1; i < m.length; i++) {
            if (m[i - 1] > m[i]) t += n - m[i - 1] + m[i];
            else t += m[i] - m[i - 1];
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