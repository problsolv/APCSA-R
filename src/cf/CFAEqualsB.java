package cf;
import java.util.Scanner;
public class CFAEqualsB {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int testCase = 0; testCase < test; testCase++) {
            int s = sc.nextInt();
            int[] a = new int[s], b = new int[s];
            int numZerosA = 0, numZerosB = 0;
            for (int i = 0; i < s; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 0) {
                    numZerosA++;
                }
            }
            int neededFixings = 0;
            for (int i = 0; i < s; i++) {
                b[i] = sc.nextInt();
                if (b[i] == 0) {
                    numZerosB++;
                }
                if (a[i] != b[i]) {
                    neededFixings++;
                }
            }
            int moves = Math.abs(numZerosB - numZerosA);
            if (neededFixings > moves) {
                moves++;
            }
            System.out.println(moves);
        }
    }
}