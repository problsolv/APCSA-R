package cf;
import java.util.*;
public class CFBrainPhoto {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() * sc.nextInt();
        while (t --> 0) {
            String s = sc.next();
            if (s.equals("C") || s.equals("M") || s.equals("Y")) {
                System.out.println("#Color");
                return;
            }
        }
        System.out.println("#Black&White");
    }
}