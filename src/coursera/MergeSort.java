package coursera;
public class MergeSort {
    static void merge(int[] arr, int low, int middle, int high) {
        int n1 = middle - low + 1, n2 = high - middle;

        int[] L = new int[n1], R = new int[n2];

        System.arraycopy(arr, low, L, 0, n1);
        for (int i = 0; i < n2; ++i) {
            R[i] = arr[middle + 1 + i];
        }
        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int m = low + (high - low) / 2;
            mergeSort(arr, low, m);
            mergeSort(arr, m + 1, high);
            merge(arr, low, m, high);
        }
    }

    public static void main(String [ ] args) {
        int[] arr = {34, 5, 56, 67, 44, 55, 57, 456, 767, 567, 45, 6, 47};
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) System.out.print(i + " ");
    }
}