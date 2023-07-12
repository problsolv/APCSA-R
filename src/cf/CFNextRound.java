package cf;
import java.util.*;
public class CFNextRound {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), m = 0, c = 0, s;
        int[] d = new int[n + 1];
        for(int i = 1; i <= n; i++) {
            s = sc.nextInt();
            d[i] = s;
            if (i == k)
                m = s;
        }
        for(int i : d) {
            if (i >= m && i > 0)
                c++;
        }
        System.out.println(c);
    }
}