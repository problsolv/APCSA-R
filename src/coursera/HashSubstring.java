package coursera;
import java.util.*;
public class HashSubstring {
    static ArrayList<Integer> RabinKarp(String stra, String strb) {
        ArrayList<Integer> result = new ArrayList<>();
        int i, j, p = 0, t = 0, h = 1;
        for (i = 0; i < stra.length() - 1; i++) h = (h * 256) % 101;
        for (i = 0; i < stra.length(); i++) {
            p = (256 * p + stra.charAt(i)) % 101;
            t = (256 * t + strb.charAt(i)) % 101;
        }

        for (i = 0; i <= strb.length() - stra.length(); i++) {
            if (p == t) {
                for (j = 0; j < stra.length(); j++) {
                    if (strb.charAt(i + j) != stra.charAt(j)) break;
                }
                if (j == stra.length()) result.add(i);
            }
            if (i < strb.length() - stra.length()) {
                t = (256 * (t - strb.charAt(i) * h) + strb.charAt(i + stra.length())) % 101;
                if (t < 0) t += 101;
            }
        }
        return result;
    }
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        for (int i : RabinKarp(sc.next(), sc.next())) System.out.print(i + " ");
    }
}