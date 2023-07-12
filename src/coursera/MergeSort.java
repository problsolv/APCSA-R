package coursera;
import java.util.Scanner;
/**
 * @author Simon Chung
 * @version 11/21/2022
 * @purpose Sort numbers by merge!
 */
public class MergeSort {
    public static void merge(int[] array, int low, int middle, int high) {
        int n1 = middle - low + 1, n2 = high - middle;

        int[] L = new int[n1], R = new int[n2];

        System.arraycopy(array, low, L, 0, n1);
        for (int i = 0; i < n2; ++i) {
            R[i] = array[middle + 1 + i];
        }
        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            }
            else {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            int m = low + (high - low) / 2;
            sort(array, low, m);
            sort(array, m + 1, high);
            merge(array, low, m, high);
        }
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        sort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}