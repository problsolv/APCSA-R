package cf;
import java.util.*;
public class CFTwins {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int t = 0;
        int[] coins = new int[sc.nextInt()];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = sc.nextInt();
            t += coins[i];
        }
        int val = 0, c = 1;
        Arrays.sort(coins);
        for (int i = coins.length - 1; i >= 0; i--) {
            val += coins[i];
            if (val > t / 2) break;
            else c++;
        }
        System.out.println(c);
    }
}