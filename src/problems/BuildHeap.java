package problems;
import java.util.*;
public class BuildHeap {
    static ArrayList<String> str = new ArrayList<>();
    static void heapify(int[] arr, int i) {
        int smallest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < arr.length && arr[l] < arr[smallest])
            smallest = l;

        if (r < arr.length && arr[r] < arr[smallest])
            smallest = r;

        if (smallest != i) {
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;
            str.add(i + " " + smallest);
            heapify(arr, smallest);
        }
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        for (int i = arr.length / 2; i >= 0; i--) heapify(arr, i);
        System.out.println(str.size());
        for (String s : str) System.out.println(s);
    }
}