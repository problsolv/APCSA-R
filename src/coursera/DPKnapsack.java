package coursera;
import java.util.*;
public class DPKnapsack {
    static int knapsack(int capacity, int[] weights) {
        int[][] r = new int[weights.length + 1][capacity + 1];
        for (int i = 0; i < r.length; i++) {
            for (int j = 0; j < r[i].length; j++) {
                if (i == 0 || j == 0) r[i][j] = 0;
                else if (weights[i - 1] <= j) r[i][j] = Math.max(weights[i - 1] + r[i - 1][j - weights[i - 1]], r[i - 1][j]);
                else r[i][j] = r[i - 1][j];
            }
        }
        return r[weights.length][capacity];
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int[] weights = new int[sc.nextInt()];
        for (int i = 0; i < weights.length; i++) weights[i] = sc.nextInt();
        System.out.println(knapsack(w, weights));
    }
}