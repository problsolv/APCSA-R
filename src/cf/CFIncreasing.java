package cf;

import java.io.*;
import java.util.*;

public class CFIncreasing {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = sc.nextInt();
        while (n-->0) {
            Map<Integer, Integer> hm = new HashMap<>();
            int m = sc.nextInt();
            boolean flag = true;
            while (m-->0) {
                int t = sc.nextInt();
                hm.put(t, hm.getOrDefault(t, 0) + 1);
                if (hm.get(t) > 1) {
                    if (flag) out.println("NO");
                    flag = false;
                }
            }
            if (flag) out.println("YES");
        }

        out.close();
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