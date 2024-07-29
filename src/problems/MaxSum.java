package problems;
import java.util.*;
public class MaxSum {
    public static void main(String [ ] args) {
        int[] arr = Max_Sum(new int[]{2, 3, 4, 6, 8, 10}, 10);
        System.out.println(arr[0] + ", " + arr[1]);
    }

    static int[] Max_Sum(int[] arr, int k) {
        Arrays.sort(arr);
        int max = Integer.MIN_VALUE, left = 0, right = arr.length - 1;
        int[] sol = new int[2];
        while (left < right) {
            if (arr[right] + arr[left] > max && arr[right] + arr[left] < k) {
                max = arr[right] + arr[left];
                sol[0] = arr[left];
                sol[1] = arr[right];
            }
            else if (arr[right] + arr[left] < k) left++;
            else right--;
        }
        return sol;
    }
}