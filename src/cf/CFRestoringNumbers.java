package cf;
import java.io.*;
import java.util.*;
public class CFRestoringNumbers {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        long[] arr = new long[4];
        for (int i = 0; i < 4; i++) arr[i] = sc.nextLong();
        Arrays.sort(arr);
        long a = arr[3] - arr[0], b = arr[3] - arr[1], c = arr[3] - arr[2];
        System.out.println(a + " " + b + " " + c);
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