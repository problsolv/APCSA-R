package problems;

import java.util.Scanner;

public class Nametag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a --> 0) {
            String name = scanner.next();
            for (int i = 0; i < name.length() + 4; i++) System.out.print("*");
            System.out.println("\n* " + name + " *");
            for (int i = 0; i < name.length() + 4; i++) System.out.print("*");
            System.out.println("\n");
        }
    }
}