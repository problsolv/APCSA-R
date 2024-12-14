package cf;
import java.util.Scanner;
public class CFBlackSquare {
  public static void main(String [ ] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
    int sum = 0;
    String s = sc.next();
    for (int i = 0; i < s.length(); i++) {
      sum += a[s.charAt(i) - '1'];
    }
    System.out.println(sum);
  }
}