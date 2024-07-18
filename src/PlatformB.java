import java.util.*;
/**
 * TESTING PLATFORM B
 */
public class PlatformB {
    static class C implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            return a - b;
        }
    }

    public static void main(String [] args) {
        Integer[] ar = {4, 5, 8, 1, 6, 3, 2};
        Arrays.sort(ar, new C());
        System.out.println(Arrays.toString(ar));
    }
}