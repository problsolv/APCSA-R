package problems;
import java.util.*;
public class FindProductTwoPairs {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 9, 2, 10};
        int[][] result = findProductOfTwoPairs(arr);
        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }
    }
    static int[][] findProductOfTwoPairs(int[] arr) {
        Map<Integer, Integer[]> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int product = arr[i] * arr[j];
                if (map.containsKey(product)) {
                    Integer[] pair = map.get(product);
                    return new int[][]{{pair[0], pair[1]}, {arr[i], arr[j]}};
                } else {
                    map.put(product, new Integer[]{arr[i], arr[j]});
                }
            }
        }
        return new int[][]{};
    }
}