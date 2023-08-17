import java.util.Scanner; // Imports Scanner library
/**
 * @author Simon Chung
 * @version 03/01/23 - 03/12/23
 * @purpose This is my Create Performance Task for APCSP.
 * Helps users convert numbers from base to base.
 */
public class M10_10CreateTask {
    static int base; // base instance variable
    static String num; // num instance variable

    private static boolean InvalidBase() { // Invalid base checker method
        boolean bool = base < 2 || base > 36; // Checks if the base is between 2 and 36, inclusive
        if (bool) System.out.println("Base must be between 2 and 36"); // Prints an error statement if base is NOT between 2 and 36
        return bool; // Returns true if the base is invalid, false if it is valid
    }

    private static int getValue(char ch) { // Method to identify the value of each digit 0-Z
        if (ch >= 'A' && ch <= 'Z') return (int) ch - 55; // If the character is between A and Z, return itself minus 55:
        // A represents 10 because A's ASCII value is 65 -> 65 - 55 = 10
        // B represents 11 because B's ASCII value is 66 -> 66 - 55 = 11
        // C represents 12 because C's ASCII value is 67 -> 67 - 55 = 12
        // ...
        // Z represents 35 because Z's ASCII value is 90 -> 90 - 55 = 35
        return Integer.parseInt(String.valueOf(ch)); // If the character is not a letter, it must be an integer 0-9
    }

    static String convert(boolean bool) { // Converting method
        String f; // Final returning variable
        boolean isNegative = true; // Negative number checker variable
        if (num.charAt(0) == '-') num = num.substring(1); // Extracts the negative sign out
        else isNegative = false; // Make the number non-negative
        if (bool) { // bool true -> Convert a number from decimal to any base
            int number = Integer.parseInt(num); // Parse the number into an int
            char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B',
                    'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                    'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'}; // Array for each ASCII value from 0 to Z
            StringBuilder str = new StringBuilder(); // Creates the return value
            while (number > 0) { // Loop to convert each character of the ASCII table
                int remainder = number % base; // The number's remainder when divided by the base
                str.insert(0, ch[remainder]); // Start creating the number from the least digit value to the greatest
                number /= base; // Divide the number by the base
            }
            if (str.toString().isEmpty()) return "0"; // Checks if the number is 0
            f = str.toString(); // Assigns the converted number to the final variable
        } else { // bool false -> Convert a number from any base back to decimal
            int place_value = 1, number = 0; // A power variable and the return value
            for (int i = num.length() - 1; i >= 0; i--) { // A loop that reverses the number String
                if (getValue(num.charAt(i)) >= base) return "invalid"; // Checks if the digits are valid to be in its base
                number += getValue(num.charAt(i)) * place_value; // Adds each value multiplied by its base value
                place_value *= base; // Increases the digit value
            }
            if (number == 0) return "0"; // Checks if the number is 0
            f = String.valueOf(number); // Assigns the converted number to the final variable
        }
        if (isNegative) f = "-" + f; // Turn the number back to negative if it originally was
        return f; // Returns the final value
    }

    public static void main(String [ ] args) { // Main method
        System.out.println("Welcome to the number converting system."); // Welcome statement
        Scanner sc = new Scanner(System.in); // Declares an instance of Scanner
        while (true) { // Begins the loop
            System.out.println("\n\nWhat do you want to do?");
            System.out.println("C - Convert a decimal number to any base");
            System.out.println("R - Convert a number from any base to decimal");
            System.out.println("D - Directly convert a number from a base to another");
            System.out.println("U - Count from a minimum to a maximum value using any base");
            System.out.println("Q - Quit");
            String response = sc.next().toUpperCase(); // Prompts the user for an input
            if (response.equals("C")) { // C converts a number from decimal to any base
                System.out.println("What decimal number do you want to convert?");
                num = String.valueOf(sc.nextInt()); // User inputs the number they want to convert
                System.out.println("What base do you want to convert it to?");
                base = sc.nextInt(); // User inputs the base they want to convert to
                if (InvalidBase()) continue; // Checks for an invalid base
                System.out.println(num + " in base " + base + " is " + convert(true)); // Prints the final value
            } else if (response.equals("R")) { // R converts a number from any base to decimal
                System.out.println("What is your number?");
                num = sc.next().toUpperCase(); // User inputs the number they want to convert
                System.out.println("What base is your number in?");
                base = sc.nextInt(); // User inputs the base their number is in
                if (InvalidBase()) continue; // Checks for an invalid base
                System.out.println(num + " in decimal is " + convert(false)); // Prints the final value
            } else if (response.equals("D")) { // D converts a number directly from one base to another
                System.out.println("What is your number?");
                num = sc.next().toUpperCase(); // User inputs the number they want to convert
                String n1 = num; // A temporary number value
                System.out.println("What base is your number in?");
                base = sc.nextInt(); // User inputs the base their number is in
                int b1 = base; // A temporary base value
                if (InvalidBase()) continue; // Checks for an invalid base
                num = convert(false); // Converts the number to decimal
                if (num.equals("invalid")) { // Checks for an invalid number
                    System.out.println("This is an invalid number.");
                    continue;
                }
                System.out.println("What base do you want to convert it to?");
                base = sc.nextInt(); // User inputs the base they want to convert to
                if (InvalidBase()) continue; // Checks for an invalid base
                System.out.print("The base " + b1 + " number, " + n1 + ", in base " + base + " is " + convert(true)); // Prints the final value
            }
            else if (response.equals("U")) { // U counts in any base
                System.out.println("What number do you want to start counting from?");
                int start = sc.nextInt(); // User inputs a starting bound
                System.out.println("What number do you want to stop at?");
                int end = sc.nextInt(); // User inputs an ending bound
                System.out.println("What base?");
                base = sc.nextInt(); // User inputs the base they want to count by
                if (InvalidBase()) continue; // Checks for an invalid base
                if (start < end) { // If the minimum value is less than maximum value, count in ascending order
                    for (int i = start; i <= end; i++) { // Loop to count in ascending order
                        num = String.valueOf(i);
                        System.out.println(i + ". " + convert(true));
                    }
                } else { // Or else count in descending order
                    for (int i = start; i >= end; i--) { // Loop to count in descending order
                        num = String.valueOf(i);
                        System.out.println(i + ". " + convert(true));
                    }
                }
            } else if (response.equals("Q")) { // Q Quits the program
                System.out.println("Thank you for the using number converting system!");
                sc.close(); // Closes the Scanner
                break; // Breaks out of the loop
            } else System.out.println("Invalid Input"); // If a response is not C, R, D, U, or Q, print an error statement
        }
    }
}