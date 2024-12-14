package cf;
import java.io.*;
import java.util.*;
public class CFLanterns {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int[] st = new int[sc.nextInt()];
        int l = sc.nextInt();
        for (int i = 0; i < st.length; i++) st[i] = sc.nextInt();
        if (st.length == 1 || l == 1) {
            System.out.println(Math.max(st[0], l - st[0]));
            return;
        }
        Arrays.sort(st);
        int max = 0;
        for (int i = 1; i < st.length; i++) {
            int d = st[i] - st[i - 1];
            if (d > max) max = d;
        }
        if (st[0] == 0 && st[st.length - 1] == l) System.out.println(max / 2.0);
        else {
            double max1 = (st[1] - st[0]) / 2.0, max2 = (st[st.length - 1] - st[st.length - 2]) / 2.0;
            if (st[0] != 0) max1 = st[0];
            if (st[st.length - 1] != l) max2 = l - st[st.length - 1];
            System.out.println((Math.max(max / 2.0, Math.max(max1, max2))));
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