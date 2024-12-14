package cf;
import java.util.Scanner;
public class CFAntonDanik {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        String str = sc.next();
        int a = 0, d = 0;
        for (int i = 0; i < b; i++) {
            if (str.charAt(i) == 'A') a++;
            else d++;
        }
        if (a > d) System.out.println("Anton");
        else if (a < d) System.out.println("Danik");
        else System.out.println("Friendship");
    }
}