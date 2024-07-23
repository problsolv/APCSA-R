/**
 * TESTING PLATFORM B
 */
public class PlatformB {
    public static void main(String[] args) {
        double n = 96;
        System.out.println(Math.floor(Math.sqrt(n)));
        System.out.println(Math.floor(sqrt(n)));
    }
    static double sqrt(double n) {
        double x = n;
        double y = 1;
        double e = 0.000001;
        while(x - y > e) {
            x = (x + y) / 2;
            y = n / x;
        }
        return x;
    }
}