package cf;
import java.io.*;
import java.util.StringTokenizer;
public class CFTaxi {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt(), t = 0;
        int[] ar = new int[3];
        for (int i = 0; i < a; i++) {
            int group = sc.nextInt();
            if (group == 1) { ar[0]++; }
            else if (group == 2) { ar[1]++; }
            else if (group == 3) { ar[2]++; }
            else { t++; }
        }
        int diff1 = Math.min(ar[0], ar[2]);
        t += diff1;
        ar[0] -= diff1; ar[2] -= diff1;
        t += ar[1] / 2;
        ar[1] %= 2;
        t += ar[2];
        t += Math.ceil((ar[0] + 2 * ar[1]) / 4.0);
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