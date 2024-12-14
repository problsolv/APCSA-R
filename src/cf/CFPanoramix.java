package cf;
import java.io.*;
import java.util.*;
public class CFPanoramix {
    static ArrayList<Integer> primes = new ArrayList<>();
    public static void main(String [ ] args) {
        FastScanner sc = new FastScanner(System.in);
        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primes.add(i);
        }
        System.out.println(binarySearch(sc.nextInt(), sc.nextInt()) ? "YES" : "NO");
    }

    static boolean binarySearch(int x, int b) {
        if (x >= 47) return false;
        int l = 0, r = primes.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (primes.get(m) == x)
                return b == primes.get(m + 1);

            // If x greater, ignore left half
            if (primes.get(m) < x)
                l = m + 1;

                // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // If we reach here, then element was
        // not present
        return false;
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