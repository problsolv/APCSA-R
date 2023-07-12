package coursera;
import java.util.Scanner;
public class Change {
    static int getChange(int m) {
        int bills = 0;
        while (m / 10 != 0) {
            bills++;
            m -= 10;
        }
        while (m / 5 != 0) {
            bills++;
            m -= 5;
        }
        return bills + m % 5;
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getChange(sc.nextInt()));
    }
}

