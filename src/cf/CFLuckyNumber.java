package cf;
import java.util.Scanner;
public class CFLuckyNumber {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int count = 0;
        char[] c = n.toCharArray();
        for (char ch : c) {
            if (ch == '7' || ch == '4') count++;
        }
        System.out.println(count == 7 || count == 4 ? "YES" : "NO");
    }
}