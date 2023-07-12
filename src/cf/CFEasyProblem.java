package cf;
import java.util.Scanner;
public class CFEasyProblem {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            if (sc.nextInt() != 0) {
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");
    }
}