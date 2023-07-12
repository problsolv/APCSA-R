import java.util.Scanner;
/**
 * @author Simon Chung
 * @version 11/05/2022
 * @purpose This program uses static methods, static variables, and constants to encrypt and
 * decrypt messages inputted by users.
 * (Client Class)
 */
public class M09_07CaesarTester {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Caesar shift cipher machine.");
        System.out.print("Input a shift key from 1-25: ");
        int key = sc.nextInt() % 26;
        M09_07CaesarDecrypter encrypter = new M09_07CaesarDecrypter(key);
        encrypter.setCipherbet();
        System.out.println("Regular alphabet:");
        encrypter.printAlphabet();
        System.out.println("Cipher alphabet:");
        encrypter.printCipherbet();
        while (true) {
            System.out.print("\n\nDo you want to encrypt or decrypt a message? E - encrypt, D - decrypt, N - new key, Q - Quit: ");
            String choice = sc.next().toUpperCase();
            if (choice.equals("E")) {
                System.out.print("What message do you want to encrypt? ");
                String[] words = (sc.next().toLowerCase() + sc.nextLine().toLowerCase()).split(" ");
                System.out.print("Encrypted message: ");
                for (String word : words) M09_07CaesarEncrypter.encrypt(word);
            } else if (choice.equals("D")) {
                System.out.print("What message do you want to decrypt? ");
                String[] words = (sc.next().toLowerCase() + sc.nextLine().toLowerCase()).split(" ");
                System.out.print("Decrypted message: ");
                for (String word : words) M09_07CaesarDecrypter.decrypt(word);
            } else if (choice.equals("N")) {
                System.out.print("Input a new shift key: ");
                key = sc.nextInt();
                encrypter = new M09_07CaesarDecrypter(key);
                encrypter.setCipherbet();
                System.out.println("Regular alphabet:");
                encrypter.printAlphabet();
                System.out.println("Cipher alphabet:");
                encrypter.printCipherbet();
            }
            else if (choice.equals("Q")) break;
            else System.out.print("Invalid Input");
        }
        System.out.println("\nThank you for using the Caesar Encrypter!");
    }
}