import java.util.Scanner;
/**
 * @author Simon Chung
 * @version 11/19/2022
 * @purpose This program allows the user to find the nth term of the Fibonacci Sequence,
 * where n is between 0 and 45.
 * (Implementation Class)
 */
public class M10_05Fibonacci {
    public void ask() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\nWhich value of the Fibonacci Sequence do you wish to know? ");
            int value = sc.nextInt();
            if (value > 47 || value < 1) {
                System.out.println("The value must be between 1 and 47 to prevent an overload.");
                continue;
            }
            System.out.println("Term " + value + " of the Fibonacci Sequence is " + fibonacci(value));
            System.out.print("Do you want to know another term? Y/N ");
            String choice = sc.next().toUpperCase();
            if (choice.equals("N")) {
                break;
            }
            else if (!choice.equals("Y")) {
                System.out.println("Invalid input");
            }
        }
    }

    public int fibonacci(int x) {
        if (x == 1) {
            return 0;
        }
        else if (x == 2) {
            return 1;
        }
        else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }
}