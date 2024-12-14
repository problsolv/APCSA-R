package cf;
import java.util.Scanner;
public class CFFence {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), h = sc.nextInt();
        int[] hs = new int[n];
        int need = 0;
        for (int i = 0; i < n; i++) {
            hs[i] = sc.nextInt();
            if (hs[i] > h) {
                need += 2;
                continue;
            }
            need++;
        }
        System.out.println(need);
    }
}