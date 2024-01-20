/**
 * TESTING PLATFORM B
 */
public class PlatformB {
    public static void main(String [ ] args) {
        int[] a = {1, -4, 6, 1, -4, -6, 2};
        int max = 0, cur = 0;
        for (int i : a) {
            cur = Math.max(i, i + cur);
            max = Math.max(max, cur);
        }
        System.out.println(max);
    }
}