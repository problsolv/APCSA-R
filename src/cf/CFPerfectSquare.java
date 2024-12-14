package cf;
import java.io.*;
import java.util.*;
public class CFPerfectSquare {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt();
        for (int ii = 0; ii < a; ii++) {
            String[] s = new String[sc.nextInt()];
            for (int j = 0; j < s.length; j++) s[j] = sc.next();
            int ans = 0;
            for (int i = 0; i * 2 < s.length; i++) {
                for (int j = 0; j * 2 < s.length; j++) {
                    ArrayList<Character> ar = new ArrayList<>();
                    ar.add(s[i].charAt(j));
                    ar.add(s[s.length - 1 - j].charAt(i));
                    ar.add(s[s.length - 1 - i].charAt(s.length - 1 - j));
                    ar.add(s[j].charAt(s.length - 1 - i));
                    for (char e : ar) ans += Collections.max(ar) - e;
                }
            }
            System.out.println(ans);
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