package cf;
import java.util.Scanner;
public class stones {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        StringBuilder f = new StringBuilder();
        for (int i = 0; i < a; i++) {
            long n = sc.nextLong();
            long[] alice = new long[(int)n];
            for (int j = 0; j < n; j++) {
                alice[j] = sc.nextLong();
            }
            double total_alice = 0;
            for (long k : alice) {
                total_alice += (Math.pow(2, k/1000000000));
            }
            long m = sc.nextLong();
            long[] bob = new long[(int)m];
            for (int j = 0; j < m; j++) {
                bob[j] = sc.nextLong();
            }
            double total_bob = 0;
            for (long k : bob) {
                total_bob += (Math.pow(2, k/1000000000));
            }
            if (total_alice > total_bob) f.append("Alice will have more fun!\n");
            else if (total_bob > total_alice) f.append("Bob will have more fun!\n");
            else f.append("Tie!\n");
        }
        System.out.print(f);
    }
}