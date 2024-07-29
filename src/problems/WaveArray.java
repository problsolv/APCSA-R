package problems;
import java.util.Arrays;
public class WaveArray {
    public static void main(String [ ] args) {
        int[] arr = convertToWave(new int[]{10, 90, 49, 2, 1, 5, 23});
        System.out.println(Arrays.toString(arr));
    }

    static int[] convertToWave(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            if(i > 0 && arr[i - 1] > arr[i])
                swap(arr, i, i-1);
            if(i < arr.length-1 && arr[i + 1] > arr[i])
                swap(arr, i, i+1);
        }
        return arr;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}