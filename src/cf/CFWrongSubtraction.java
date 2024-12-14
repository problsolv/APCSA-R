package cf;
import java.util.Scanner;
public class CFWrongSubtraction {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt(), a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            if (b % 10 == 0) b /= 10;
            else b--;
        }
        System.out.println(b);
    }
}