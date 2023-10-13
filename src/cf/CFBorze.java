package cf;
import java.util.*;
public class CFBorze {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    s = s.replace("--", "2");
    s = s.replace("-.", "1");
    s = s.replace(".", "0");
    System.out.println(s);
  }
}