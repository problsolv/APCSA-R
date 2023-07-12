package cf;
import java.util.Scanner;
public class CFDrinks {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double t = 0;
        for (int i = 0; i < a; i++) {
            t += sc.nextInt();
        }
        System.out.println(t / a);
    }
}