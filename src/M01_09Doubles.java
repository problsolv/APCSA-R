/**
 * @author Simon Chung
 * @version 05/27/2022
 * @purpose This program performs order of operations: addition, subtraction, multiplication, division,
 * and modulus on decimals (doubles) and integers (ints).
 */
public class M01_09Doubles {
    public static void main(String [ ] args) {
        int int1 = 25, int2 = 9;
        double doub1 = 43.21, doub2 = 3.14;

        // Addition
        System.out.println("Addition");
        System.out.println(int1 + " + " + int2 + " = " + (25 + 9));
        System.out.println(doub1 + " + " + doub2 + " + 10.00 = " + (doub1 + doub2 + 10.00));
        System.out.println();

        // Subtraction
        System.out.println("Subtraction");
        System.out.println("11 - " + int2 + " - " + int1 + " = " + (11 - int2 - int1));
        System.out.println(doub2 + " - 10.00 = " + (doub2 - 10.00));
        System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        System.out.println(int1 + " * " + int2 + " = " + (int1 * int2));
        System.out.println(doub2 + " * 10.00 * 10.00 = " + (doub2 * 10.00 * 10.00));
        System.out.println();

        // Division
        System.out.println("Division");
        System.out.println(int2 + " / " + int1 + " = " + (9 / 25));
        System.out.println(doub1 + " / 10.00 = " + (doub1 / 10.00));
        System.out.println();

        // Modulus
        System.out.println("Modulus");
        System.out.println("11 mod " + int2 + " = " + (11 % int2));
        System.out.println("10.00 mod " + doub2 + " = " + (10.00 % doub2));
        System.out.println();

        // My expressions
        System.out.print("My expressions\n");
        System.out.println(int1 + " + " + int2 + " - " + doub1 + " - " + doub2 + " = " +
                String.format("%.02f", int1 + int2 - doub1 - doub2));
        System.out.println("22 mod " + "(" + int1 + " - " + int2 + ")" + " = " +
                (22 % (int1 - int2)));
        System.out.println(int1 + " * " + doub1 + " / " + doub2 + " - " + int2 + " = " + (int1 * doub1 / doub2 + int2) + "\n");
    }
}