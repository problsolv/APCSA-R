/**
 * TESTING PLATFORM B
 */
public class PlatformB {
    public static void main(String [ ] args) {
        int[] a = {5, -6, 2, -4, 3, -1, 0, -4};
        int max = 0, cur = 0;
        for (int i : a) {
            cur = Math.max(i, i + cur);
            max = Math.max(max, cur);
        }
        System.out.println(max);
    }
}