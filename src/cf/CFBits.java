package cf;
import java.util.Scanner;
public class CFBits {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), temp = 0;
        for(int i = 0; i < a; i++) {
            String s = sc.next();
            if (s.equals("++X") || s.equals("X++")) {
                temp++;
            } else if (s.equals("--X") || s.equals("X--")) {
                temp--;
            }
        }
        System.out.println(temp);
    }
}