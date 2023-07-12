/**
 * @author Simon Chung
 * @version 06/08/2022
 * @purpose This program uses 3 different methods and return functions to calculate order of operations
 * with the numbers 10 and 5.
 */
public class M02_09Methods {
    public static void addTheseTwo() {
        System.out.println("Ten plus five equals " + (10 + 5));
    }

    public static void multiplyTheseTwo(int a, int b) {
        System.out.println("Ten times five equals " + (a * b));
    }

    public static int divideTheseTwo(int a, int b) {
        return a / b;
    }

    public static void main(String [ ] args) {
        int x = 10;
        int y = 5;
        addTheseTwo();
        multiplyTheseTwo(x, y);
        System.out.print("Ten divided by five equals " + divideTheseTwo(x, y));
    }
}