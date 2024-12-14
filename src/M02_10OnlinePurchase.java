import java.util.Scanner;
/**
 * @author Simon Chung
 * @version 06/08/2022
 * @purpose This program asks the user for their information and orders using parsing, strings, substrings,
 * and order of operations.
 */
public class M02_10OnlinePurchase {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        // name
        System.out.print("Please enter your first and last name: ");
        String name = sc.nextLine();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        int space = name.indexOf(" ");
        String last = name.substring(space + 1);
        last = last.substring(0, 1).toUpperCase() + last.substring(1);
        String receipt_name = name.charAt(0) + ". " + last;

        // date
        System.out.print("Enter today's date (mm/dd/yyyy): ");
        String receipt_date = sc.nextLine().replaceAll("/", "-");

        // product
        System.out.print("What game do you want? ");
        String game = sc.nextLine();
        System.out.print("How many games? ");
        int num_of_games = sc.nextInt();

        // price
        System.out.print("What is the game's price? ");
        double price = sc.nextDouble();

        // debit card
        System.out.print("Enter your debit card information (####-####-####-####): ");
        String debit = sc.next();
        int debitInt = Integer.parseInt(debit.substring(debit.length() - 4));

        // pin
        System.out.print("Enter your 4 digit PIN (####): ");
        int pinInt = sc.nextInt() % 10;

        // accommodations
        System.out.print("Would you like any accommodations for your order? ");
        String accommodations = new Scanner(System.in).nextLine();

        // order number
        StringBuilder order = new StringBuilder();
        for (int var = 0; var < 2; var++) {
            order.append((char)((Math.random() * 25) + 97));
        }
        for (int var = 0; var < 3; var++) {
            order.append((int)(Math.random() * 10));
        }

        // receipt
        System.out.println("\n*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        System.out.println("Your e-Receipt:\n");
        System.out.println(receipt_date);
        System.out.println("Order number: " + order + "\n");
        System.out.println("\t " + receipt_name);
        System.out.println("\t Account: ####-####-####-" + debitInt);
        System.out.println("\t PIN: ###" + pinInt);
        System.out.println("\t Game: " + game);
        System.out.println("\t Quantity: " + num_of_games);
        System.out.println("\t Cost per game: $" + price + "\n");
        price *= num_of_games;
        System.out.println("$" + String.format("%.02f", price) + " will be debited to your account.\n");
        System.out.println("Your accommodations: " + accommodations);
        System.out.println("Thank you. Enjoy the game.");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        sc.close();
    }
}