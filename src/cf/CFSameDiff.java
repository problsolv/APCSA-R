package cf;
import java.io.*;
import java.util.*;

public class CFSameDiff {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt();
        while (a-->0) {
            HashMap<Integer, Integer> hm = new HashMap<>();
            long x = sc.nextInt(), r = 0;
            for (int i = 0; i < x; i++) {
                int y = sc.nextInt() - i;
                r += hm.getOrDefault(y, 0);
                hm.put(y, hm.getOrDefault(y, 0) + 1);
            }
            System.out.println(r);
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