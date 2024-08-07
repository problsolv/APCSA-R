package problems;
import java.util.*;
public class MaxSum {
    public static void main(String [ ] args) {
        int[] arr = {1, 2, 5, 7, 10, 14, 19, 20, 21, 24};
        int k = 9;
        sum(arr, k);
        difference(arr, k);
    }

    static void sum(int[] arr, int k) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[right] + arr[left] == k) {
                System.out.println(arr[left] + ", " + arr[right]);
                return;
            }
            else if (arr[right] + arr[left] < k) {
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println("No such pair found");
    }

    static void difference(int[] arr, int k) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[right] - arr[left] == k) {
                System.out.println(arr[left] + ", " + arr[right]);
                return;
            }
            else if (arr[right] - arr[left] < k) {
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println("No such pair found");
    }
}