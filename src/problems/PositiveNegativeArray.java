package problems;
public class PositiveNegativeArray {
    public static void main(String [ ] args) {
        int[] a = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        rearrange(a, a.length);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
    static void rearrange(int[] a, int n) {
        int l = 0, h = n - 1;
        while (l <= h) {
            if (a[l] <= 0) l++;
            else swap(a, l, h--);
        }
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}