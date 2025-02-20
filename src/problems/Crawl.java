package problems;

import java.util.Scanner;

public class Crawl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a --> 0) {
            int b = sc.nextInt(), c = sc.nextInt();
            String[][] d = new String[c][b];
            for (int i = 0; i < d.length; i++) {
                d[i] = sc.next().split("");
            }
            boolean flag = false;
            for (int i = 0; i < d.length; i++) {
                for (int j = 0; j < d[i].length; j++) {
                    if (d[i][j].equals("%")) {
                        flag = true;
                        System.out.println("[" + i + "," + j + "]");
                        break;
                    }
                }
                if (flag) break;
            }
        }
    }
}
