package cf;
import java.util.Scanner;
public class CFTranslation {
    public static String reverse(String str) {
        if (str.length() == 0) return "";
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        String orig = sc.next(), reverse = sc.next();
        if (reverse(orig).equals(reverse)) System.out.println("YES");
        else System.out.println("NO");
    }
}