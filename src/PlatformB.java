import java.util.*;
/**
 * TESTING PLATFORM B
 */
public class PlatformB {
    public static void main(String[] args) {
        Integer[] arr = {5, 20, 3, 2, 50, 80};
        int n = 78;
        Arrays.sort(arr);
        for (Integer i : arr) {
            int b = binarySearch(arr, n + i);
            if (b != -1) {
                System.out.println("(" + i + ", " + arr[b] + ")");
                return;
            }
        }
        System.out.println("No Such Pair");
    }

    static int binarySearch(Integer[] arr, int n) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == n) {
                return m;
            }
            if (arr[m] < n) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }
}