/**
 * @author Simon Chung
 * @version 11/05/2022
 * @purpose This program uses static methods, static variables, and constants to decrypt
 * messages inputted by users.
 * (Decrypter Class)
 */
public class M09_07CaesarDecrypter extends M09_07CaesarEncrypter {
    private static int myKey;
    private static final char[] cipherbet = new char[26];

    public M09_07CaesarDecrypter(int key) {
        super(-key);
        myKey = 26 - key;
    }

    public void setCipherbet() {
        for (int i = 0; i < 26; i++) {
            cipherbet[i] = (char)(((alphabet[i] + myKey) - 97) % 26 + 97);
        }
    }

    public void printCipherbet() {
        for (char letter : cipherbet) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public static void decrypt(String word) {
        encrypt(word, myKey);
    }
}