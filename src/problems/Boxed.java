package problems;

import java.util.Scanner;

public class Boxed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a --> 0) {
            if (sc.nextInt() * sc.nextInt() * sc.nextInt() <= 180) System.out.println("yes");
            else System.out.println("no");
        }
    }
}