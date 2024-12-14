package cf;
import java.io.*;
import java.util.StringTokenizer;
public class CFDragons {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int s = sc.nextInt(), n = sc.nextInt();
        boolean bool = false;
        int[][] t = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                t[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            int j = i;
            while ((j > 0) && (t[j][0] < t[j - 1][0])) {
                int[] temp = t[j];
                t[j] = t[j - 1];
                t[j - 1] = temp;
                j--;
            }
        }
        for (int i = 0; i < n; i++) {
            if (s > t[i][0]) s += t[i][1];
            else {
                bool = true;
                break;
            }
        }
        System.out.println(bool ? "NO" : "YES");
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