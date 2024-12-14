package cf;
import java.io.*;
import java.util.*;
public class CFThreeThreadlets {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            int[] r = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(r);
            if (r[1] % r[0] != 0 || r[2] % r[0] != 0) {
                System.out.println("NO");
                continue;
            }
            if (r[0] == r[1] && r[1] == r[2]) {
                System.out.println("YES");
                continue;
            }
            System.out.println(r[1] / r[0] - 1 + r[2] / r[0] - 1 <= 3 ? "YES" : "NO");
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