package cf;
import java.io.*;
import java.util.StringTokenizer;
public class CFAntonandLetters {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String s = sc.nextLine();
        if (s.length() == 2) {
            System.out.println(0);
            return;
        }
        String[] st = new String[s.length() / 3];
        int c = 0;
        for (int i = 1; i < s.length(); i += 3) {
            st[c] = s.substring(i, i + 1);
            c++;
        }
        int e = 0;
        for (int i = 0; i < st.length; i++) {
            String k = st[i];
            for (int j = i + 1; j < st.length; j++) {
                if (k.equals(st[j])) {
                    e++;
                    break;
                }
            }
        }
        out.println(st.length - e);
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