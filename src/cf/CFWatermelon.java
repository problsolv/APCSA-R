package cf;
import java.util.Scanner;
public class CFWatermelon {
    public static void main(String [ ] args) {
        int a = new Scanner(System.in).nextInt();
        System.out.println((a % 2 != 0 || a == 2) ? "NO" : "YES");
    }
}