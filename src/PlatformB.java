import java.util.*;

/**
 * TESTING PLATFORM B
 */
public class PlatformB {

    static void heapify(int[] arr, int N, int i) {
        int smallest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] < arr[smallest])
            smallest = l;

        // If right child is larger than largest so far
        if (r < N && arr[r] < arr[smallest])
            smallest = r;

        // If largest is not root
        if (smallest != i) {
            int swap = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = swap;
            System.out.println(i + " " + smallest);

            // Recursively heapify the affected subtree
            heapify(arr, N, smallest);
        }
    }

    // Function to build a Max-Heap from the Array
    static void buildHeap(int[] arr, int N)
    {
        // Index of last non-leaf node
        int startIdx = (N / 2);

        // Perform reverse level order traversal
        // from last non-leaf node and heapify
        // each node
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, N, i);
        }
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        buildHeap(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}