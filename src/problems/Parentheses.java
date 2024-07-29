package problems;
import java.util.Scanner;
public class Parentheses {
    static long getMaximValue(String exp) {
        int n = exp.length() / 2 + 1;
        long[][] min = new long[n][n], max = new long[n][n];
        for (int i = 0; i < min.length; i++) {
            min[i][i] = exp.charAt(i * 2) - 48;
            max[i][i] = exp.charAt(i * 2) - 48;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int k = i + j;
                long[] r = getMinMax(exp, j, k, min, max);
                min[j][k] = r[0];
                max[j][k] = r[1];
            }
        }
        return max[0][n - 1];
    }

    static long[] getMinMax(String exp, int i, int j, long[][] min, long[][] max) {
        long[] r = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        for (int k = i; k < j; k++) {
            char op = exp.charAt(k * 2 + 1);
            long a = eval(min[i][k], min[k + 1][j], op),
            b = eval(min[i][k], max[k + 1][j], op),
            c = eval(max[i][k], min[k + 1][j], op),
            d = eval(max[i][k], max[k + 1][j], op);
            r[0] = Math.min(a, Math.min(b, Math.min(c, Math.min(d, r[0]))));
            r[1] = Math.max(a, Math.max(b, Math.max(c, Math.max(d, r[1]))));
        }
        return r;
    }

    static long eval(long a, long b, char op) {
        if (op == '+') return a + b;
        else if (op == '-') return a - b;
        else if (op == '*') return a * b;
        assert false;
        return 0;
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(getMaximValue(sc.next()));
    }
}