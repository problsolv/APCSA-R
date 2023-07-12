package coursera;
import java.util.*;
public class EditDistance {
    public static int editDistance(String s, String t) {
        int[][] arr = new int[s.length() + 1][t.length() + 1];
        for (int i = 0; i < arr[0].length; i++) arr[0][i] = i;
        for (int i = 0; i < arr.length; i++) arr[i][0] = i;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) arr[i][j] = arr[i - 1][j - 1];
                else arr[i][j] = 1 + Math.min(Math.min(arr[i - 1][j - 1], arr[i][j - 1]), arr[i - 1][j]);
            }
        }
        return arr[s.length()][t.length()];
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(editDistance(sc.next(), sc.next()));
    }
}