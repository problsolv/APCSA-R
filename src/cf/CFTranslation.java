package cf;
import java.util.Scanner;
public class CFTranslation {
    public static String reverse(String str) {
        if (str.isEmpty()) return "";
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverse(sc.next()).equals(sc.next()) ? "YES" : "NO");
    }
}