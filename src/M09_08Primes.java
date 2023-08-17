import java.util.ArrayList;
/**
 * @author Simon Chung
 * @version 11/08/2022
 * @purpose This program identifies the prime integers between any 2 given integers from the user.
 * (Implementation Class)
 */
public class M09_08Primes {
    private final int min, max;
    private final ArrayList<Integer> primes = new ArrayList<>();

    public M09_08Primes(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void filter() {
        for (int i = min; i <= max; i++) {
            boolean isPrime = i != 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primes.add(i);
        }
    }

    public String toString() {
        if (primes.isEmpty()) {
            return "There are no prime numbers between " + min + " and " + max + ".";
        }
        StringBuilder str = new StringBuilder("There are " + primes.size() + " prime numbers between " + min + " and " + max + ". They are:\n");
        for (int prime : primes) {
            str.append(prime).append("\n");
        }
        return str.toString();
    }
}