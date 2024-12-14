import java.util.ArrayList;
/**
 * @author Simon Chung
 * @version 11/08/2022
 * @purpose This program identifies the prime integers between any 2 given integers from the user.
 * (Implementation Class)
 */
public class M09_08Primes {
    private final int MIN, MAX;
    private final ArrayList<Integer> PRIMES = new ArrayList<>();

    public M09_08Primes(int min, int max) {
        this.MIN = min;
        this.MAX = max;
    }

    public void filter() {
        for (int i = MIN; i <= MAX; i++) {
            boolean isPrime = i != 1;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) PRIMES.add(i);
        }
    }

    public String toString() {
        if (PRIMES.isEmpty()) {
            return "There are no prime numbers between " + MIN + " and " + MAX + ".";
        }
        StringBuilder str = new StringBuilder("There are " + PRIMES.size() + " prime numbers between " + MIN + " and " + MAX + ". They are:\n");
        for (int prime : PRIMES) {
            str.append(prime).append("\n");
        }
        return str.toString();
    }
}