package cf;
import java.util.Scanner;
public class CFWord {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char[] ch = word.toCharArray();
        int capital = 0, lowercase = 0;
        for (char c : ch) {
            String t = String.valueOf(c);
            if (t.equals(t.toLowerCase())) lowercase++;
            else capital++;
        }
        if (capital <= lowercase) System.out.println(word.toLowerCase());
        else System.out.println(word.toUpperCase());
    }
}