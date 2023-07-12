package cf;
import java.io.*;
import java.util.StringTokenizer;
public class CFJoke {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String a = sc.next() + sc.next(), b = sc.next();
        if (a.length() == b.length()) {
            boolean equiv = true;
            for (char i = 'A'; i <= 'Z'; i++) {
                if (a.contains(String.valueOf(i))) {
                    a = a.replaceAll(String.valueOf(i), "");
                    int la = a.length();
                    b = b.replaceAll(String.valueOf(i), "");
                    int lc = b.length();
                    if (la != lc) {
                        equiv = false;
                        break;
                    }
                }
            }
            if (equiv) out.println("YES");
            else out.println("NO");
        }
        else out.println("NO");
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