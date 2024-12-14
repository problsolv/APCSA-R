package cf;
import java.util.Scanner;
public class CFRequiredRemainder {
  public static void main(String [ ] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for (int i = 0; i < a; i++) {
      int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt(), z = n - n % x + y;
      z -= z > n ? x : 0;
      System.out.println(z);
    }
  }
}