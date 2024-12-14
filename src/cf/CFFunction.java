package cf;
import java.util.Scanner;
public class CFFunction {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        if (a % 2 == 0) a /= 2;
        else a = -(a / 2 + 1);
        System.out.println(a);
    }
}