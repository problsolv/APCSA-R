package cf;
import java.io.*;
import java.util.*;
public class CFDesignTutorial {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        boolean[] mark = new boolean[1000001];
        for (int i = 2; i < mark.length; i++) {
            if (!mark[i]) {
                for (int j = 2 * i; j < mark.length; j += i)
                    mark[j] = true;
            }
        }
        int x = sc.nextInt();
        for (int i = 4; i <= x - 4; i++) {
            if (mark[i] && mark[x - i]) {
                System.out.println(i + " " + (x - i));
                break;
            }
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