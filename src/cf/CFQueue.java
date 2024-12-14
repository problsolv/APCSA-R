package cf;
import java.util.Scanner;
public class CFQueue {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), steps = sc.nextInt();
        String s = sc.next();
        for (int i = 0; i < steps; i++) {
            s = s.replace("BG", "GB");
        }
        System.out.println(s);
    }
}