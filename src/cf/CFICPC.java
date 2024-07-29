package cf;
import java.io.PrintWriter;
import java.util.*;
public class CFICPC {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Map<Character, Integer> hm = new HashMap<>();
            for (char c : s.toCharArray()) {
                hm.put(c, hm.getOrDefault(c, 0) + 1);
            }
            int a = 0;
            for (int i : hm.values()) {
                a += i;
            }
            out.println(hm.size() + a);
        }
        out.close();
        sc.close();
    }
}