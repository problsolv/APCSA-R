package problems;
import java.util.Arrays;
public class MergeSortandCount {
    static int inversionCount(int[] arr, int l, int r) {
        if (l >= r) return 0;
        int m = (l + r) / 2;
        int count = inversionCount(arr, l, m) + inversionCount(arr, m + 1, r);
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;
        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                count += m - i + 1;
                temp[k++] = arr[j++];
            }
        }
        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];
        for (i = l; i <= r; i++) arr[i] = temp[i - l];
        return count;
    }
    public static void main(String [ ] args) {
        int[] arr = {8, 4, 2, 1};
        System.out.println(inversionCount(arr, 0, arr.length - 1));
        System.out.println(Arrays.toString(arr));
    }
}