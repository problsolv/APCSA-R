package coursera;
public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high], i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = t;
        return i + 1;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int part = partition(arr, low, high);
            quickSort(arr, low, part - 1);
            quickSort(arr, part + 1, high);
        }
    }

    public static void main(String [ ] args) {
        int[] arr = {34, 5, 56, 67, 44, 55, 57, 456, 767, 567, 45, 6, 47};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) System.out.print(i + " ");
    }
}