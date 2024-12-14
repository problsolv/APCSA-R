package cf;
import java.util.*;
public class CFHelpfulMath {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] a = new int[str.length() / 2 + 1];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(String.valueOf(str.charAt(j)));
            j += 2;
        }
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) System.out.println(a[i]);
            else System.out.print(a[i] + "+");
        }
    }
}