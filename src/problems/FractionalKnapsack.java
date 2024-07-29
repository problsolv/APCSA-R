package problems;
import java.util.Scanner;
public class FractionalKnapsack {
    static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        while (capacity > 0) {
            double max = 0, maxIndex = 0;
            for (int i = 0; i < values.length; i++) {
                if ((double)values[i] / weights[i] > max) {
                    max = (double)values[i] / weights[i];
                    maxIndex = i;
                }
            }
            int t = 0, t1 = weights[(int)maxIndex];
            while (capacity > 0 && weights[(int)maxIndex] > 0) {
                capacity--;
                weights[(int)maxIndex]--;
                t++;
            }
            value += t * ((double)values[(int)maxIndex] / t1);
            weights[(int)maxIndex] = Integer.MAX_VALUE;
        }
        return (double)Math.round(value * 10000);
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), capacity = sc.nextInt();
        int[] values = new int[n], weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
            weights[i] = sc.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights) / 10000);
    }
}