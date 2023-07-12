import java.util.*;
/**
 * TESTING PLATFORM B
 */
public class PlatformB {
    static void sort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) heap(arr, arr.length, i);
        for (int i = arr.length - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // call max heapify on the reduced heap
            heap(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    static void heap(int[] arr, int size, int i) {
        int min = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        // If left child is larger than root
        if (l < size && arr[l] > arr[min]) min = l;

        // If right child is larger than largest so far
        if (r < size && arr[r] > arr[min]) min = r;

        // If largest is not root
        if (min != i) {
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            // Recursively heapify the affected subtree
            System.out.println(i + " " + min);
            System.out.println(Arrays.toString(arr));
            heap(arr, size, min);
        }
    }

    public static void main(String [ ] args) {
        int[] a = {5, 4, 3, 2, 1};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}