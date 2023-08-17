package cf;
import java.io.*;
import java.util.*;
public class CFGeneral {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int[] a = new int[sc.nextInt()];
        int max = 0, min = Integer.MAX_VALUE, maxi = 0, mini = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] > max) {
                max = a[i];
                maxi = i;
            }
            if (a[i] <= min) {
                min = a[i];
                mini = i;
            }
        }
        int tm = mini;
        mini = a.length - mini - 1;
        if (maxi < tm) System.out.println(maxi + mini);
        else System.out.println(maxi + mini - 1);
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