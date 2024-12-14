package cf;
import java.util.Scanner;
public class CFString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String one = sc.next().toLowerCase();
        String two = sc.next().toLowerCase();
        if (one.compareTo(two) > 0) System.out.println(1);
        else if (one.compareTo(two) < 0) System.out.println(-1);
        else System.out.println(0);
    }
}