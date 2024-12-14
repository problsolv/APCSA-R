package cf;
import java.io.*;
import java.util.*;
public class CFSerejaDima {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        ArrayList<Integer> ar = new ArrayList<>();
        int a = sc.nextInt(), s = 0, d = 0;
        for (int i = 0; i < a; i++) ar.add(sc.nextInt());
        boolean bool = true;
        while (!ar.isEmpty()) {
            int i = ar.size() - 1;
            if (ar.get(0) > ar.get(i)) {
                if (bool) s += ar.get(0);
                else d += ar.get(0);
                ar.remove(0);
            }
            else {
                if (bool) s += ar.get(i);
                else d += ar.get(i);
                ar.remove(i);
            }
            bool = !bool;
        }
        System.out.println(s + " " + d);
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