package cf;
import java.util.Scanner;
public class CFTeam {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int v = 0, t = 0, a = sc.nextInt();
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < 3; j++) {
                t += sc.nextInt();
            }
            if(t >= 2) {
                v++;
            }
            t = 0;
        }
        System.out.println(v);
    }
}