package cf;
import java.io.*;
import java.util.*;
public class CFSpy {
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            ArrayList<Integer> arr = new ArrayList<>(), temp = new ArrayList<>();
            int b = sc.nextInt();
            for (int j = 0; j < b; j++) {
                int c = sc.nextInt();
                arr.add(c);
                temp.add(c);
            }
            Collections.sort(temp);
            int spy;
            if (!Objects.equals(temp.get(0), temp.get(1))) spy = temp.get(0);
            else spy = temp.get(temp.size() - 1);
            for (int j = 0; j < arr.size(); j++) {
                if (spy == arr.get(j)) {
                    System.out.println(j + 1);
                    break;
                }
            }

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