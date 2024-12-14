package cf;
import java.io.*;
import java.util.StringTokenizer;
public class CFIQTest {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) arr[i] = sc.nextInt();
        int e = 0, o = 0;
        for (int i = 0; i < a; i++) {
            if (arr[i] % 2 == 0) e++;
            else o++;
        }
        if (e > o) {
            for (int i = 0; i < a; i++) {
                if (arr[i] % 2 != 0) {
                    out.println(i + 1);
                    break;
                }
            }
        }
        else {
            for (int i = 0; i < a; i++) {
                if (arr[i] % 2 == 0) {
                    out.println(i + 1);
                    break;
                }
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