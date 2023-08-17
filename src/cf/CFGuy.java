package cf;
import java.io.*;
import java.util.*;
public class CFGuy {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = sc.nextInt();
        int[] arr1 = new int[sc.nextInt()];
        for (int i = 0; i < arr1.length; i++) arr1[i] = sc.nextInt();
        int[] arr2 = new int[sc.nextInt()];
        for (int i = 0; i < arr2.length; i++) arr2[i] = sc.nextInt();
        int x = 0, y = 0;
        for (int i = 1; i <= a; i++) {
            if (Arrays.toString(arr1).contains(String.valueOf(i))) {
                x++;
                continue;
            }
            if (Arrays.toString(arr2).contains(String.valueOf(i))) y++;
        }
        System.out.println(x + y == a ? "I become the guy." : "Oh, my keyboard!");
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