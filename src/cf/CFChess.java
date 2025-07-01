package cf;

import java.io.*;
import java.util.StringTokenizer;

public class CFChess {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String s = sc.next(), t = sc.next();
        int[] ar1 = {s.charAt(0) - 'a', s.charAt(1)-'1'};
        int[] ar2 = {t.charAt(0) - 'a', t.charAt(1)-'1'};
        int[][] d = new int[8][8];
        for (int i = 0; i < 8; i++) {
            d[ar1[0]][i] = 1;
            d[i][ar1[1]] = 1;
        }
        if (ar2[0] - 2 >= 0 && ar2[1] - 1 >= 0) d[ar2[0] - 2][ar2[1] - 1] = 1;
        if (ar2[0] - 2 >= 0 && ar2[1] + 1 < 8) d[ar2[0] - 2][ar2[1] + 1] = 1;
        if (ar2[0] + 2 < 8 && ar2[1] - 1 >= 0) d[ar2[0] + 2][ar2[1] - 1] = 1;
        if (ar2[0] + 2 < 8 && ar2[1] + 1 < 8) d[ar2[0] + 2][ar2[1] + 1] = 1;
        if (ar2[0] - 1 >= 0 && ar2[1] - 2 >= 0) d[ar2[0] - 1][ar2[1] - 2] = 1;
        if (ar2[0] - 1 >= 0 && ar2[1] + 2 < 8) d[ar2[0] - 1][ar2[1] + 2] = 1;
        if (ar2[0] + 1 < 8 && ar2[1] - 2 >= 0) d[ar2[0] + 1][ar2[1] - 2] = 1;
        if (ar2[0] + 1 < 8 && ar2[1] + 2 < 8) d[ar2[0] + 1][ar2[1] + 2] = 1;

        if (ar1[0] - 2 >= 0 && ar1[1] - 1 >= 0) d[ar1[0] - 2][ar1[1] - 1] = 1;
        if (ar1[0] - 2 >= 0 && ar1[1] + 1 < 8) d[ar1[0] - 2][ar1[1] + 1] = 1;
        if (ar1[0] + 2 < 8 && ar1[1] - 1 >= 0) d[ar1[0] + 2][ar1[1] - 1] = 1;
        if (ar1[0] + 2 < 8 && ar1[1] + 1 < 8) d[ar1[0] + 2][ar1[1] + 1] = 1;
        if (ar1[0] - 1 >= 0 && ar1[1] - 2 >= 0) d[ar1[0] - 1][ar1[1] - 2] = 1;
        if (ar1[0] - 1 >= 0 && ar1[1] + 2 < 8) d[ar1[0] - 1][ar1[1] + 2] = 1;
        if (ar1[0] + 1 < 8 && ar1[1] - 2 >= 0) d[ar1[0] + 1][ar1[1] - 2] = 1;
        if (ar1[0] + 1 < 8 && ar1[1] + 2 < 8) d[ar1[0] + 1][ar1[1] + 2] = 1;
        int ans = -1;
        for (int[] i : d) {
            for (int j : i) {
                if (j == 0) ans++;
            }
        }
        out.println(ans);
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