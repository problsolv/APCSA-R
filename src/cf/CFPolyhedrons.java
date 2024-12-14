package cf;
import java.io.*;
import java.util.StringTokenizer;
public class CFPolyhedrons {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = sc.nextInt(), s = 0;
        for (int i = 0; i < a; i++) {
            String str = sc.next();
            switch (str) {
                case "Icosahedron":
                    s += 20;
                    break;
                case "Dodecahedron":
                    s += 12;
                    break;
                case "Octahedron":
                    s += 8;
                    break;
                case "Cube":
                    s += 6;
                    break;
                default:
                    s += 4;
                    break;
            }
        }
        out.println(s);
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