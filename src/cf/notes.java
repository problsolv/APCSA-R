package cf;
import java.util.Scanner;
public class notes {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder f = new StringBuilder();
        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int[] arr = new int[b];
            for (int j = 0; j < b; j++) {
                arr[j] = sc.nextInt();
            }
            double caughtpercent = 100;
            for (int e : arr) {
                caughtpercent *= 0.01 * (100 - e);
            }
            int c = (int)caughtpercent;
            f.append(c).append("\n");
        }
        System.out.println(f);
    }
}