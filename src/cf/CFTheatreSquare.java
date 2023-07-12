package cf;
import java.util.Scanner;
public class CFTheatreSquare {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt();
        int countn = n / a, countm = m / a;
        if(n % a != 0) {
            countn++;
        }
        if(m % a != 0) {
            countm++;
        }
        System.out.println((long)countm * countn);
    }
}