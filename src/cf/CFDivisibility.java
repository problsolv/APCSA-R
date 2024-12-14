package cf;
import java.io.*;
import java.util.StringTokenizer;
public class CFDivisibility {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int[] ar = new int[sc.nextInt()];
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < ar.length; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            if (a % b == 0) {
                s.append(0).append("\n");
                continue;
            }
            s.append(b - a % b).append("\n");
        }
        out.println(s);
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