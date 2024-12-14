package cf;
import java.io.*;
import java.util.*;
public class CFTwoArraysSwap {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[] ar = new int[sc.nextInt()], br = new int[ar.length];
            int k = sc.nextInt(), sum = 0;
            for (int j = 0; j < ar.length; j++) ar[j] = sc.nextInt();
            for (int j = 0; j < ar.length; j++) br[j] = sc.nextInt();
            Arrays.sort(ar);
            Arrays.sort(br);
            for (int j = 0; j < k; j++) {
                if (ar[j] < br[ar.length - j - 1]) ar[j] = br[ar.length - j - 1];
                else break;
            }
            for (int value : ar) sum += value;
            System.out.println(sum);
        }
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