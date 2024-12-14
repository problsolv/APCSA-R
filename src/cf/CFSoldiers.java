package cf;
import java.util.Scanner;
public class CFSoldiers {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt(), money = sc.nextInt(), want = sc.nextInt(), cost = 0;
        for (int i = 0; i < want; i++) {
            cost += (first * (i + 1));
        }
        System.out.println(cost < money ? 0 : cost - money);
    }
}