package cf;
import java.util.*;
public class CFDiceRoll {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(toFraction((7 - Math.max(sc.nextDouble(), sc.nextDouble())) / 6.0));
    }
    static String toFraction(double x) {
        if (x < 0) return "-" + toFraction(-x);
        double tolerance = 1.0E-6, h1 = 1, h2 = 0, k1 = 0, k2 = 1, b = x;
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