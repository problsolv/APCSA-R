package cf;
import java.util.*;
public class CFSquare {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int[] x = new int[4];
            int[] y = new int[4];
            for (int i = 0; i < 4; i++) {
                x[i] = sc.nextInt();
                y[i] = sc.nextInt();
            }
            Arrays.sort(x);
            Arrays.sort(y);
            System.out.println((x[2]-x[1])*(y[2]-y[1]));
        }
    }
}