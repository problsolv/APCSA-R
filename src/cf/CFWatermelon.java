package cf;
import java.util.Scanner;
public class CFWatermelon {
    public static void main(String [ ] args) {
        int a = new Scanner(System.in).nextInt();
        if(a % 2 != 0 || a == 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}