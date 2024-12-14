package cf;
import java.util.Scanner;
public class CFStringTask {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        String[] r = {"a", "e", "i", "o", "u", "y"};
        for (String s : r) {
            str = str.replace(s, "");
        }
        StringBuilder f = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            f.append(".").append(str.charAt(i));
        }
        System.out.println(f);
    }
}