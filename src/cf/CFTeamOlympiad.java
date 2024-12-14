package cf;
import java.io.*;
import java.util.*;
public class CFTeamOlympiad {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int[] s = new int[sc.nextInt()];
        ArrayList<Integer> one = new ArrayList<>(), two = new ArrayList<>(), three = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextInt();
            if (s[i] == 1) one.add(s[i]);
            else if (s[i] == 2) two.add(s[i]);
            else three.add(s[i]);
        }
        int min = Math.min(three.size(), Math.min(two.size(), one.size()));
        System.out.println(min);
        if (min == 0) return;
        boolean c1 = true, c2 = true, c3 = true;
        for (int i = 0; i < min; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[j] == 1 && c1) {
                    System.out.print(j + 1 + " ");
                    c1 = false;
                    s[j] = 0;
                }
                if (s[j] == 2 && c2) {
                    System.out.print(j + 1 + " ");
                    c2 = false;
                    s[j] = 0;
                }
                if (s[j] == 3 && c3) {
                    System.out.print(j + 1 + " ");
                    c3 = false;
                    s[j] = 0;
                }
            }
            c1 = true;
            c2 = true;
            c3 = true;
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