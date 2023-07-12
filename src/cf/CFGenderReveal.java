package cf;
import java.util.*;
public class CFGenderReveal {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int count = 1;
        char[] ch = word.toCharArray();
        Arrays.sort(ch);
        for (int i = 1; i < ch.length; i++)
            if (ch[i - 1] != ch[i])
                count++;
        if(count % 2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");
    }
}