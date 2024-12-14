/**
 * @author Simon Chung
 * @version 11/19/2022
 * @purpose This program allows the user to find the nth term of the Fibonacci Sequence,
 * where n is between 0 and 45.
 * (Client Class)
 */
public class M10_05FibonacciTester {
    public static void main(String [ ] args) {
        System.out.println("The 1st term of the Fibonacci Sequence is 0");
        System.out.println("The 2nd term of the Fibonacci Sequence is 1");
        M10_05Fibonacci rabbit = new M10_05Fibonacci();
        rabbit.ask();
        System.out.println("\nThank you for using the Fibonacci Sequence function!");
    }
}