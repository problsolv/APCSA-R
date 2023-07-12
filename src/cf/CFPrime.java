package cf;
import java.io.*;
import java.util.*;
public class CFPrime {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        HashSet<Long> h = new HashSet<>();
        h.add(4L);
        long[] a = new long[sc.nextInt()];
        for (int i = 0; i < a.length; i++) a[i] = sc.nextLong();
        boolean[] b = new boolean[1000001];
        b[2] = true;
        for (int i = 3; i < b.length; i += 2) {
            b[i] = true;
        }
        for (int i = 3; i < b.length; i += 2) {
            if (b[i]) for (int j = 3 * i; j < b.length; j += 2 * i) b[j] = false;
        }
        for (int i = 3; i < b.length; i += 2) if (b[i]) h.add((long)i * i);
        for (long l : a) {
            if (h.contains(l)) System.out.println("YES");
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