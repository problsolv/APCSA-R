import java.util.*;
/**
 * TESTING PLATFORM A
 */
public class PlatformA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Math.abs(Integer.MIN_VALUE));
        System.out.println(Math.abs(Integer.MAX_VALUE));
        int n = sc.nextInt();
        sc.nextLine();
        while (n-->0) {
            String line = sc.nextLine().trim();
            String[] parts = line.split("\\s+");
            int[] arr = new int[parts.length];
            int sum = 0;

            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
                sum += arr[i];
            }

            // If total sum is odd → cannot partition
            if (sum % 2 != 0) {
                System.out.println("Indeed here I come.");
                continue;
            }
            sum /= 2;
            // DP array: dp[i] = can we form sum i?
            boolean[] dp = new boolean[sum + 1];
            dp[0] = true;

            for (int num : arr) {
                for (int j = sum; j >= num; j--) {
                    dp[j] |= dp[j - num];
                }
            }
            System.out.println(Arrays.toString(dp).replaceAll("[\\[\\],]", ""));

            System.out.println(dp[sum] ? "Job secured." : "Indeed here I come.");
        }
        sc.close();
    }
}