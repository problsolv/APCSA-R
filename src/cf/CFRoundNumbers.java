package cf;
import java.io.*;
import java.util.*;
public class CFRoundNumbers {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int[] arr = new int[sc.nextInt()];
        ArrayList<ArrayList<Integer>> r = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        for (int k : arr) {
            String s = String.valueOf(k);
            ArrayList<Integer> t = new ArrayList<>();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) != '0') {
                    if (j == s.length() - 1) t.add(k % 10);
                    else t.add(((int) s.charAt(j) - '0') * (int) Math.pow(10, s.length() - j - 1));
                }
            }
            r.add(t);
        }
        for (ArrayList<Integer> i : r) {
            System.out.println(i.size());
            for (int j : i) System.out.print(j + " ");
            System.out.println();
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