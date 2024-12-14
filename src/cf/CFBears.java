package cf;
import java.util.Scanner;
public class CFBears {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), n = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            n++;
        }
        System.out.println(n);
    }
}