package cf;
import java.io.*;
import java.util.*;
public class CFNewYearFriends {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        System.out.println(a[2] - a[0]);
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