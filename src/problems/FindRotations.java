package problems;
public class FindRotations {
    public static void main(String [ ] args) {
        int[] nums = {7, 9, 11, 12, 5};
        //find how many times this array has been rotated.
        System.out.println(findRotations(nums));
    }
    static int findRotations(int[] ar) {
        if (ar[0] < ar[ar.length - 1]) return 0;
        int l = 0;
        int r = ar.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (m < r && ar[m] > ar[m + 1]) {
                return m + 1;
            }
            if (m > l && ar[m - 1] > ar[m]) {
                return m;
            } else if (ar[l] <= ar[m]) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
}