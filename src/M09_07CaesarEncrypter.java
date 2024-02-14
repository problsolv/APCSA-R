/**
 * @author Simon Chung
 * @version 11/05/2022
 * @purpose This program uses static methods, static variables, and constants to encrypt
 * messages inputted by users.
 * (Encrypter Class)
 */
public class M09_07CaesarEncrypter {
    private static int myKey;
    public static final char[] ALPHABET = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public M09_07CaesarEncrypter(int key) {
        myKey = 26 - key;
    }

    public void printAlphabet() {
        for (char letter : ALPHABET) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public static void encrypt(String word) {
        char[] message = word.toCharArray();
        StringBuilder encrypted = new StringBuilder();
        for (char c : message) {
            encrypted.append((char)(((c - 97 + myKey) % 26) + 97));
        }
        System.out.print(encrypted + " ");
    }

    public static void encrypt(String word, int key) {
        char[] message = word.toCharArray();
        StringBuilder encrypted = new StringBuilder();
        for (char c : message) {
            encrypted.append((char)(((c - 97 + key) % 26) + 97));
        }
        System.out.print(encrypted + " ");
    }
}