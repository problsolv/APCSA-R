package cf;
import java.util.Scanner;
public class CFStones {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char last = s.charAt(0);
        int c = 0;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == last) c++;
            else last = s.charAt(i);
        }
        System.out.println(c);
    }
}