package problems;

import java.util.Arrays;
import java.util.Scanner;

public class Pork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] p = new int[2];
        while (a --> 0) {
            if (sc.next().equals("pork")) {
                p[0]++;
            } else {
                p[1]++;
            }
        }
        System.out.println(Arrays.toString(p));
    }
}
