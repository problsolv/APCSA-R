package cf;
import java.util.Scanner;
public class CFMagnets {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[sc.nextInt()];
        int c = 1;
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
            if (i > 0 && str[i].charAt(0) == str[i - 1].charAt(1)) c++;
        }
        System.out.println(c);
    }
}