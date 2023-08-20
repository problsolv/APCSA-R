package coursera;
import java.util.*;
public class ChangeDP {
    static int getChange(int m) {
        int[] coins = {1, 3, 4};
        int[][] arr = new int[coins.length + 1][m + 1];
        Arrays.fill(arr[0], Integer.MAX_VALUE);

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (coins[i - 1] <= j) arr[i][j] = Math.min(1 + arr[i][j - coins[i - 1]], arr[i - 1][j]);
                else arr[i][j] = arr[i - 1][j];
            }

        }
        return arr[coins.length][m];
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getChange(sc.nextInt()));
    }
}