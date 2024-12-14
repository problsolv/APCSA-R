package cf;
import java.io.*;
import java.util.*;
public class CFFairDivision {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int o = 0, tw = 0, a = sc.nextInt();
            for (int j = 0; j < a; j++) {
                if (sc.nextInt() == 1) o++;
                else tw++;
            }
            if (o % 2 == 0 && tw % 2 == 0) System.out.println("YES");
            else if (o % 2 == 0 && tw % 2 == 1 && o > 0) System.out.println("YES");
            else System.out.println("NO");
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