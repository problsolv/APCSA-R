package cf;
import java.io.*;
import java.util.*;
public class CFInterestingDrink {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int[] s = new int[sc.nextInt()];
        for (int i = 0; i < s.length; i++) s[i] = sc.nextInt();
        Arrays.sort(s);
        int d = sc.nextInt();
        for (int i = 0; i < d; i++) System.out.println(bin(s, 0, s.length, sc.nextInt()));
    }

    static int bin(int[] s, int l, int h, int t) {
        if (l + 1 >= h) {
            if (s[l] <= t) return h;
            else return l;
        }
        int mid = (l + h) / 2;
        if (s[mid] <= t) return bin(s, mid, h, t);
        else return bin(s, l, mid, t);
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