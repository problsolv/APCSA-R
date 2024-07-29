package cf;
import java.io.*;
import java.util.*;
public class CFCypher {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t --> 0) {
            int[] a = new int[sc.nextInt()];
            for (int i = 0; i < a.length; i++) a[i] = sc.nextInt() + 10;
            for (int i : a) {
                int sl = sc.nextInt();
                String[] s = sc.next().split("");
                int changes = 0;
                for (int j = 0; j < sl; j++) {
                    changes += s[j].equals("U") ? -1 : 1;
                }
                out.print((i + changes) % 10 + " ");
            }
            out.println();
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