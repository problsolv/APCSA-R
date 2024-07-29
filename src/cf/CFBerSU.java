package cf;
import java.util.*;
import java.io.*;
public class CFBerSU {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int[] b = new int[sc.nextInt()];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        int[] g = new int[sc.nextInt()];
        for (int i = 0; i < g.length; i++) {
            g[i] = sc.nextInt();
        }
        int c = 0;
        Arrays.sort(g);
        for (int k : b) {
            for (int j = 0; j < g.length; j++) {
                if (Math.abs(k - g[j]) <= 1) {
                    c++;
                    g[j] = 1000;
                    break;
                }
            }
        }
        out.println(c);
        out.close();
        sc.close();
    }
}