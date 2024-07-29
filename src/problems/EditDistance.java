package problems;
import java.util.*;
public class EditDistance {
    public static int editDistance(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i < dp[0].length; i++) dp[0][i] = i;
        for (int i = 0; i < dp.length; i++) dp[i][0] = i;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1];
                else dp[i][j] = 1 + Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]);
            }
        }
        return dp[s.length()][t.length()];
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(editDistance(sc.next(), sc.next()));
    }
}