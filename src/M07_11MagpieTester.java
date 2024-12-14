import java.util.Scanner;
/**
 * @author Simon Chung
 * @version 09/18/22
 * @purpose A simple class to run the Magpie class.
 * Code adapted from work by Laurie White for the College Board.
 * (Client Class)
 */
public class M07_11MagpieTester {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        M07_11Magpie magpie = new M07_11Magpie();
        System.out.println(magpie.getGreeting());
        String statement = sc.nextLine();
        while (!statement.equals("Bye")) {
            System.out.println(magpie.getResponse(statement));
            statement = sc.nextLine();
        }
        System.out.println("See you next time!");
    }
}