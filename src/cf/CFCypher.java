package cf;
import java.util.*;
public class CFCypher {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int[] a = new int[sc.nextInt()];
            for (int i = 0; i < a.length; i++) a[i] = sc.nextInt() + 10;
            for (int i : a) {
                int sl = sc.nextInt();
                String[] s = sc.next().split("");
                int changes = 0;
                for (int j = 0; j < sl; j++) {
                    changes += s[j].equals("U") ? -1 : 1;
                }
                System.out.print((i + changes) % 10 + " ");
            }
            System.out.println();
        }
    }
}