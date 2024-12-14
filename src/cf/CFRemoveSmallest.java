package cf;

import java.io.*;
import java.util.*;
public class CFRemoveSmallest {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int b = sc.nextInt();
            for (int j = 0; j < b; j++) arr.add(sc.nextInt());
            Collections.sort(arr);
            for (int j = 1; j < arr.size(); j++) {
                if (arr.get(j) - arr.get(j - 1) <= 1) {
                    arr.remove(j - 1);
                    j--;
                }
            }
            if (arr.size() == 0 || arr.size() == 1) System.out.println("YES");
            else System.out.println("NO");
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