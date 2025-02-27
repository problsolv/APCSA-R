import java.util.Scanner;
/**
 * @author Simon Chung
 * @version 11/08/2022
 * @purpose This program identifies the prime integers between any 2 given integers from the user.
 * (Client Class)
 */
public class M09_08PrimesTester {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a minimum value: ");
        int MIN = sc.nextInt();
        System.out.print("Please enter a maximum value: ");
        int MAX = sc.nextInt();
        if (MIN >= MAX) {
            System.out.println("Your minimum value must be less than your maximum value.");
            main(args);
        } else if (MIN < 0) {
            System.out.println("Your minimum value must be positive.");
            main(args);
        }
        else {
            M09_08Primes primes = new M09_08Primes(MIN, MAX);
            primes.filter();
            System.out.print(primes);
        }
    }
}