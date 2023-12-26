import java.util.*;
/**
 * TESTING PLATFORM B
 */
public class PlatformB {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        double m = (7 - Math.max(sc.nextInt(), sc.nextInt())) / 6.0;
        System.out.println(convertDecimalToFraction(m));
    }
    static private String convertDecimalToFraction(double x) {
        if (x < 0) return "-" + convertDecimalToFraction(-x);
        double tolerance = 1.0E-6;
        double h1 = 1, h2 = 0, k1 = 0, k2 = 1, b = x;
        do {
            double a = Math.floor(b), aux = h1;
            h1 = a * h1 + h2;
            h2 = aux;
            aux = k1;
            k1 = a * k1 + k2;
            k2 = aux;
            b = 1 / (b - a);
        } while (Math.abs(x - h1 / k1) > x * tolerance);
        return (int) h1 + "/" + (int) k1;
    }
}