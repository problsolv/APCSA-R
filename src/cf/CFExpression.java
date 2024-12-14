package cf;
import java.io.*;
import java.util.StringTokenizer;
public class CFExpression {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        boolean aa = a == 1, bb = b == 1, cc = c == 1;
        if(aa && bb && cc) out.println(3);
        else if ((aa && bb) || (cc && bb) || (aa && cc)) {
            if (aa && cc) out.println(a + b + c);
            else if (aa) out.println((a + b) * c);
            else out.println(a * (b + c));
        }
        else if (aa || bb || cc) out.println(Math.max(((a + b) * c), (a * (b + c))));
        else out.println(a * b * c);
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