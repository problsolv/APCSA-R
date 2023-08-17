package cf;
import java.util.Scanner;
public class CFPhysicist {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), x = 0, y = 0, z = 0;
        for (int i = 0; i < a; i++) {
            x += sc.nextInt();
            y += sc.nextInt();
            z += sc.nextInt();
        }
        System.out.println((x == 0 && y == 0 && z == 0) ? "YES" : "NO");
    }
}