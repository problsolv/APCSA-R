package cf;
import java.util.Scanner;
public class CFTram {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = 0, min = 0;
        for (int i = 0; i < n; i++) {
            current = current + sc.nextInt() + sc.nextInt();
            if (current > min) {
                min = current;
            }
        }
        System.out.println(min);
    }
}