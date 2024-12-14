package cf;
import java.util.Scanner;
public class CFLuckyDivision {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = {4, 7, 44, 47, 74, 77, 444, 447, 477, 777, 774, 744};
        for (int e : arr) {
            if (a % e == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}