import java.io.PrintWriter;
import java.util.Scanner;
public class CowHiding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        int[] p = new int[n];
        char[] d = new char[n];

        for (int i = 0; i < n; i++) {
            d[i] = sc.next().charAt(0);
            p[i] = sc.nextInt();
        }

        int min = (int)Math.pow(10, 9);
        for (int i = 0; i < n; i++) {
            int cur = 0;
            for (int j = 0; j < n; j++) {
                if ((d[j] == 'L' && p[j] < p[i]) || (d[j] == 'G' && p[j] > p[i])) {
                    cur++;
                }
            }
            min = Math.min(min, cur);
        }
        pw.println(min);
        sc.close();
        pw.close();
    }
}
