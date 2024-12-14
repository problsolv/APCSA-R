package cf;
import java.io.*;
import java.util.StringTokenizer;
public class CFKefaFirstSteps {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) arr[i] = sc.nextInt();
        int m = 1, c = 1;
        for (int i = 1; i < a; i++) {
            if (arr[i-1] <= arr[i]) {
                c++;
                if (c > m) m = c;
            }
            else c = 1;
        }
        out.println(m);
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