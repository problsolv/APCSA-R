import java.util.*;
public class BuildHeap {
    private final int[] heap;
    private int size;
    private final int maxsize;
    private final ArrayList<String> str = new ArrayList<>();

    // Constructor of this class

    public BuildHeap(int maxsize, int[] arr)
    {

        // This keyword refers to current object itself
        /**
        this.maxsize = maxsize;
        heap = new int[arr.length + 1];
        System.arraycopy(arr, 0, heap, 1, heap.length - 1);
        heap[0] = Integer.MIN_VALUE;
        this.size = heap.length;
         */
        heap = arr;
        this.maxsize = maxsize;
        size = heap.length;
    }

    // Method 1
    // Returning the position of
    // the parent for the node currently
    // at pos
    private int parent(int pos) {
        return (pos - 1) / 2;
    }

    // Method 2
    // Returning the position of the
    // left child for the node currently at pos
    private int leftChild(int pos) {
        return (2 * pos) + 1;
    }

    // Method 3
    // Returning the position of
    // the right child for the node currently
    // at pos
    private int rightChild(int pos) {
        return (2 * pos) + 2;
    }

    // Method 4
    // Returning true if the passed
    // node is a leaf node
    private boolean isLeaf(int pos) {
        return (pos) >= size / 2;
    }

    // Method 5
    // To swap two nodes of the heap
    private void swap(int fpos, int spos) {
        int tmp = heap[fpos];

        heap[fpos] = heap[spos];
        heap[spos] = tmp;

        str.add(fpos + " " + spos);
        System.out.println(fpos + " " + spos);
        System.out.println(Arrays.toString(heap));
        System.out.println("---------------");
    }

    // Method 6
    // To heapify the node at pos
    private void minHeapify(int pos) {
        System.out.println("pos: " + pos);
        if (!isLeaf(pos)) {
            int swapPos;
            // swap with the minimum of the two children
            // to check if right child exists. Otherwise, default value will be '0'
            // and that will be swapped with parent node.
            if(rightChild(pos)<size)
                swapPos = (heap[leftChild(pos)] < heap[rightChild(pos)]) ? leftChild(pos) : rightChild(pos);
            else
                swapPos = leftChild(pos);

            if(heap[pos]> heap[leftChild(pos)] || heap[pos]> heap[rightChild(pos)]) {
                swap(pos, swapPos);
                minHeapify(swapPos);
            }
        }
    }

    // Method 7
    // To insert a node into the heap
    public void insert(int element) {
        if (size >= maxsize) return;

        heap[++size] = element;
        int current = size;

        while (heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Method 8
    // To print the contents of the heap
    public void print() {
        for (int i = 1; i < size / 2; i++) {

            // Printing the parent and both childrens
            System.out.print(
                    " PARENT : " + heap[i]
                            + " LEFT CHILD : " + heap[2 * i]
                            + " RIGHT CHILD :" + heap[2 * i + 1]);

            // By here new line is required
            System.out.println();
        }
        System.out.println("---------RESULTS---------");
        System.out.println(str.size());
        for (String s : str) {
            System.out.println(s);
        }
        //System.out.println(Arrays.toString(heap));
    }


    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
        BuildHeap b = new BuildHeap(a, arr);
        for (int i = arr.length - 1; i >= 0; i--) b.minHeapify(i);
        b.print();
    }
}