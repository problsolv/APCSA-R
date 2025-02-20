package problems;

import java.util.Scanner;

public class Collector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a --> 0) {
            int f = sc.nextInt(), l = sc.nextInt(), tt = l;
            int t = 0;
            while (l --> 0) {
                t += sc.next().replace("*", "").length();
            }
            if (tt * tt < f) {
                System.out.println("you gotta be kidding me");
                continue;
            }
            if (t == f) System.out.println("yes");
            else System.out.println("jared ate them");
        }
    }
}
