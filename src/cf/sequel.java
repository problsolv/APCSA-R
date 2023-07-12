package cf;
import java.util.Scanner;
public class sequel {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder f = new StringBuilder();
        for (int i = 0; i < a; i++) {
            String s = sc.next();
            String str = s + " 2: Return of The " + s + "!\n";
            f.append(str);
        }
        System.out.println(f);
    }
}