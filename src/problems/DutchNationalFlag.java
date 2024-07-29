package problems;
public class DutchNationalFlag {
    public static void main(String [ ] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 2, 0, 1, 0, 2, 1, 0, 1, 2, 1, 2};
        int l = 0, m = 0, h = arr.length - 1;
        while (m <= h) {
            if (arr[m] == 0) {
                swap(arr, l++, m++);
            } else if (arr[m] == 1) {
                m++;
            } else {
                swap(arr, m, h--);
            }
        }
        for (int i : arr) System.out.print(i + " ");
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}