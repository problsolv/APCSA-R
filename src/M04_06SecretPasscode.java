import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * @author Simon Chung
 * @version 06/22/2022
 * @purpose This program allows users to input the number of characters they want
 * their passwords to be, and have the system generate a password from the ASCII table for them.
 */
public class M04_06SecretPasscode {
    public static void main(String [ ] args) throws IOException {
        File password = new File("passwords.txt");
        Scanner infile = new Scanner(System.in);
        PrintWriter outfile = new PrintWriter(password);
        int var = 0;
        System.out.println("**********************************************************");
        System.out.println("Welcome the random password generator.");
        System.out.println("The passwords we generate will include letters, numbers, and special characters.");
        while (true) {
            System.out.print("\nEnter a password length (6 or more): ");
            int pwLength = infile.nextInt();
            if (pwLength >= 6) {
                System.out.println("\nA " + pwLength + " character long password has been written to the text file.");
                var++;
                outfile.print(var + ".\t");
                for (int i = 0; i < pwLength; i++) outfile.print((char) ((Math.random() * 94) + 33));
                outfile.println();
                System.out.print("Would you like to generate another password?\tY/N ");
                String userChoice = infile.next().toUpperCase();
                if (userChoice.equals("N")) {
                    outfile.close();
                    System.out.println("\nThank you for using the passcode generator! Here are your randomly generated passwords:\n");
                    infile = new Scanner(password);
                    while (infile.hasNext()) System.out.println(infile.nextLine());
                    infile.close();
                    break;
                } else if (!userChoice.equals("Y")) System.out.println("Invalid input");
            }
            else System.out.println("\nPassword length too short. Please try again.");
        }
    }
}