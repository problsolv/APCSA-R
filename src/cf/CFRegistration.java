package cf;
import java.io.*;
import java.util.*;
public class CFRegistration {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Map<String, Integer> db = new HashMap<>();
        int t = sc.nextInt();
        while (t --> 0) {
            String s = sc.next();
            if (db.getOrDefault(s, 0) == 0) {
                out.println("OK");
                db.put(s, 1);
            } else {
                out.println(s + db.get(s));
                db.put(s, db.get(s) + 1);
            }
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