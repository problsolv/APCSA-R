package cf;
import java.util.Scanner;
public class CFLongWords {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder f = new StringBuilder();
        for (int i = sc.nextInt(); i > 0; i--) {
            String b = sc.next();
            if (b.length() > 10) f.append(b.charAt(0)).append(b.length() - 2).append(b.charAt(b.length() - 1));
            else f.append(b);
            f.append("\n");
        }
        System.out.print(f);
    }
}