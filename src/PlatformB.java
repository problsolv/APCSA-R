/**
 * TESTING PLATFORM B
 */
public class PlatformB {
    static long binaryToDecimal(String str, int val) {
        return str.isEmpty() ? 0 : ((long)((str.charAt(str.length() - 1) - '0') * Math.pow(2, val)) + binaryToDecimal(str.substring(0, str.length() - 1), val + 1));
    }
    static String decimalToBinary(long n) {
        return n == 0 ? "" : (decimalToBinary(n / 2) + (n % 2));
    }
    public static void main(String [ ] args) {
        System.out.println(binaryToDecimal("111111", 0));
        System.out.println(decimalToBinary(63));
    }
}