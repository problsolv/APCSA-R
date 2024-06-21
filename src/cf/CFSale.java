package cf;
import java.io.*;
import java.util.*;
public class CFSale {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int[] a = new int[sc.nextInt()];
        int l = sc.nextInt(), t = 0;
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        for (int i = 0; i < l; i++) {
            if (a[i] < 0) t -= a[i];
            else break;
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