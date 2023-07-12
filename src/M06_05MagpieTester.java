import java.util.Scanner;
/**
 * @author Simon Chung
 * @version 08/08/2022
 * @purpose A program to carry on conversations with a human user.
 * This is the initial version that:
 *     - Uses indexOf to find strings
 *     - Handles responding to simple words and phrases
 * This version uses a nested if to handle default responses.
 * Code adapted from work by Laurie White for the College Board.
 * (Client class)
 */
public class M06_05MagpieTester {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        M06_05Magpie magpie = new M06_05Magpie();
        System.out.println(magpie.getGreeting());
        String statement = sc.nextLine();
        while (!statement.equals("Bye")) {
            System.out.println(magpie.getResponse(statement));
            statement = sc.nextLine();
        }
        System.out.println("See you next time!");
    }
}