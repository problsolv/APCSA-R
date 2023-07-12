package cf;
import java.util.Scanner;
public class shapeshifter {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder f = new StringBuilder();
        for (int i = 0; i < a; i++) {
            double b = sc.nextInt() * Math.sqrt(Math.PI);
            f.append(b).append("\n");
        }
        System.out.println(f);
    }
}