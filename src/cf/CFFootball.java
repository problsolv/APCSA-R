package cf;
import java.util.Scanner;
public class CFFootball {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.contains("0000000") || s.contains("1111111")) System.out.println("YES");
        else System.out.println("NO");
    }
}