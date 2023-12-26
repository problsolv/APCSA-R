package coursera;
import java.util.*;
public class LCS {
    public static int lcs2(int[] a, int[] b) {
        int[][] dp = new int[a.length + 1][b.length + 1];
        for (int i = 0; i <= a.length; i++) {
            for (int j = 0; j <= b.length; j++) {
                if (i == 0 || j == 0) dp[i][j] = 0;
                else if (a[i - 1] == b[j - 1]) dp[i][j] = dp[i - 1][j - 1] + 1;
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[a.length][b.length];
    }

    public static int lcs3(int[] a, int[] b, int[] c) {
        int[][][] dp = new int[a.length + 1][b.length + 1][c.length + 1];
        for (int i = 0; i <= a.length; i++) {
            for (int j = 0; j <= b.length; j++) {
                for (int k = 0; k <= c.length; k++) {
                    if (i == 0 || j == 0 || k == 0) dp[i][j][k] = 0;
                    else if (a[i - 1] == b[j - 1] && a[i - 1] == c[k - 1]) dp[i][j][k] = dp[i - 1][j - 1][k - 1] + 1;
                    else dp[i][j][k] = Math.max(dp[i][j][k - 1], Math.max(dp[i - 1][j][k], dp[i][j - 1][k]));
                }
            }
        }
        return dp[a.length][b.length][c.length];
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        for (int i = 0; i < a.length; i++) a[i] = sc.nextInt();
        int[] b = new int[sc.nextInt()];
        for (int i = 0; i < b.length; i++) b[i] = sc.nextInt();
        int[] c = new int[sc.nextInt()];
        for (int i = 0; i < c.length; i++) c[i] = sc.nextInt();
        System.out.println(lcs2(a, b));
        System.out.println(lcs3(a, b, c));
    }
}