package cf;
import java.io.*;
import java.util.*;
public class CFSpellCheck {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt();
            String s = sc.next();
            if (l != 5) {
                System.out.println("NO");
                continue;
            }
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if (sorted.equals("Timru")) System.out.println("YES");
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