package cf;

import java.util.*;

public class CFLaptops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] l = new int[n][2];

        for (int i = 0; i < n; i++) {
            l[i][0] = sc.nextInt();
            l[i][1] = sc.nextInt();
        }

        Arrays.sort(l, Comparator.comparingInt(a -> a[0]));

        boolean happyAlex = false;
        for (int i = 0; i < n - 1; i++) {
            if (l[i][1] > l[i + 1][1]) {
                happyAlex = true;
                break;
            }
        }

        System.out.println(happyAlex ? "Happy Alex" : "Poor Alex");
    }
}
