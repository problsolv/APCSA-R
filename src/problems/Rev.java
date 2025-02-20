package problems;

import java.util.*;

public class Rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n --> 0) {
            String s = sc.next();
            int l = (int)Math.ceil(Math.sqrt(s.length()));
            String[] st = new String[l];
            for (int i = 0; i < l; i++) {
                if (i * l >= s.length()) {
                    break;
                }
                st[i] = s.substring(i * l, Math.min(s.length(), (i + 1) * l));
            }
            //System.out.println(Arrays.toString(st));
            for (int i = l; i --> 0;) {
                if (st[i] == null) st[i] = "*";
                while (st[i].length() < l) {
                    st[i] += "*";
                }
                if (!st[i].contains("*")) break;
            }
            int i = l;
            while (i --> 0) {
                System.out.println(st[i]);
            }
            System.out.println();
        }
    }
}