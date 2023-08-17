package coursera;
public class HeapSort {
    static void heapify(int[] arr, int size, int pos) {
        int largest = pos;
        int l = 2 * pos + 1;
        int r = 2 * pos + 2;
        if (l < size && arr[l] > arr[largest]) largest = l;

        if (r < size && arr[r] > arr[largest]) largest = r;

        if (largest != pos) {
            int swap = arr[pos];
            arr[pos] = arr[largest];
            arr[largest] = swap;
            heapify(arr, size, largest);
        }
    }

    public static void heapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) heapify(arr, arr.length, i);
        for (int i = arr.length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void main(String [ ] args) {
        int[] arr = {34, 5, 56, 67, 44, 55, 57, 456, 767, 567, 45, 6, 47};
        heapSort(arr);
        for (int i : arr) System.out.print(i + " ");
    }
}
