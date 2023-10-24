package cf;
import java.util.Scanner;
public class CFDivision {
  public static void main(String [ ] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    for (int i = 0; i < a; i++) {
      System.out.print("Division ");
      int b = sc.nextInt();
      if (b >= 1900) System.out.println(1);
      else if (b >= 1600) System.out.println(2);
      else if (b >= 1400) System.out.println(3);
      else System.out.println(4);
    }
  }
}