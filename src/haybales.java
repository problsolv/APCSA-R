import java.io.*;
import java.util.*;
public class haybales {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(new File("haybales.in"));
        //PrintWriter pw = new PrintWriter("haybales.out");
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int[] n = new int[sc.nextInt()];
        int q = sc.nextInt();
        for (int i = 0; i < n.length; i++) n[i] = sc.nextInt();
        Arrays.sort(n);
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt(), sol1 = -1, b = sc.nextInt(), sol2 = -1;
            int left = 0, right = n.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (n[mid] >= a) {
                    sol1 = mid;
                    right = mid - 1;
                } else left = mid + 1;
            }
            if (sol1 == -1) {
                pw.println(0);
                continue;
            }

            left = 0;
            right = n.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (n[mid] <= b) {
                    sol2 = mid;
                    left = mid + 1;
                } else right = mid - 1;
            }
            if (sol2 == -1 || sol1 > sol2) {
                pw.println(0);
                continue;
            }
            pw.println(sol2 - sol1 + 1);

        }
        sc.close();
        pw.close();
    }
}
