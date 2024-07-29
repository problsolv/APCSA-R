package cf;
import java.util.*;
import java.io.*;
public class CFDoubleString {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t --> 0) {
            String[] st = new String[sc.nextInt()];
            Map<String, Boolean> hm = new HashMap<>();
            for (int i = 0; i < st.length; i++) {
                st[i] = sc.next();
                hm.put(st[i], true);
            }
            for (String s : st) {
                boolean flag = false;
                for (int i = 1; i < s.length(); i++) {
                    if (hm.getOrDefault(s.substring(0, i), false) && hm.getOrDefault(s.substring(i), false)) {
                        flag = true;
                        break;
                    }
                }
                out.print(flag ? 1 : 0);
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