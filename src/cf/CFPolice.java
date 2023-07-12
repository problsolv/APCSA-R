package cf;
import java.io.*;
import java.util.StringTokenizer;
public class CFPolice {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int[] arr = new int[sc.nextInt()];
        int u = 0, ex = 0;
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) u++;
            else if (arr[i] > 0) {
                ex += arr[i];
                arr[i] = 0;
                int j = i;
                while (j < arr.length && ex > 0) {
                    if (arr[j] == -1) {
                        ex--;
                        arr[j] = Integer.MIN_VALUE;
                    }
                    j++;
                }
            }
        }
        System.out.println(u);
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