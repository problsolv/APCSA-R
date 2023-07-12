package cf;
import java.util.Scanner;
public class CFPresents {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int[] o = new int[sc.nextInt()];
        int[] n = new int[o.length];
        for (int i = 0; i < o.length; i++) {
            o[i] = sc.nextInt();
            n[o[i] - 1] = i + 1;
        }
        for (int i : n) System.out.print(i + " ");
    }
}