import java.util.Scanner;
/**
 * TESTING PLATFORM A
 */
public class PlatformA {
    static int base;

    public static boolean InvalidBase() {
        boolean bool = base > 36 || base < 2;
        if (bool) System.out.println("Base must be between 2 and 36");
        return bool;
    }

    public static String convert(int num, int orig) {
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8',
                '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        if (num == 0) {
            if (orig < 0) return "-";
            else if (orig == 0) return "0";
            return "";
        }
        return convert(num / base, orig) + ch[num % base];
    }

    public static String convert(int num) {
        return convert(Math.abs(num), num);
    }

    public static int getValue(char ch) {
        if (ch >= 'A' && ch <= 'Z') return (int) ch - 55;
        return Integer.parseInt(String.valueOf(ch));
    }

    public static String revert(String num, int place_value, int fin) {
        if (num.length() == 0) return String.valueOf(fin);
        if (getValue(num.charAt(num.length() - 1)) >= base) return "invalid";
        fin += getValue(num.charAt(num.length() - 1)) * place_value;
        return revert(num.substring(0, num.length() - 1), place_value * base, fin);
    }

    public static String revert(String num) {
        String str;
        if (num.charAt(0) == '-') str = "-" + revert(num.substring(1), 1, 0);
        else str = revert(num, 1, 0);
        if (str.equals("-invalid") || str.equals("-0")) return str.substring(1);
        return str;
    }

    public static void main(String [ ] args) {
        System.out.println("Welcome to the number converting system.");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n\nWhat do you want to do?");
            System.out.println("C - Convert a decimal number to any base");
            System.out.println("R - Convert a number from any base to decimal");
            System.out.println("D - Directly convert a number from a base to another");
            System.out.println("U - Count from a minimum to a maximum value using any base");
            System.out.println("Q - Quit");

            String response = sc.next().toUpperCase();
            if (response.equals("C")) {
                System.out.println("What decimal number do you want to convert?");
                int num = sc.nextInt();
                System.out.println("What base do you want to convert it to?");
                base = sc.nextInt();
                if (InvalidBase()) continue;
                System.out.println(num + " in base " + base + " is " + convert(num));
            }
            else if (response.equals("R")) {
                System.out.println("What is your number?");
                String num = sc.next().toUpperCase();
                System.out.println("What base is your number in?");
                base = sc.nextInt();
                if (InvalidBase()) continue;
                System.out.println(num + " in decimal is " + revert(num));
            }
            else if (response.equals("D")) {
                System.out.println("What is your number?");
                String num = sc.next().toUpperCase(), n1 = num;
                System.out.println("What base is your number in?");
                base = sc.nextInt();
                int b1 = base;
                if (InvalidBase()) continue;
                num = revert(num);
                if (num.equals("invalid")) {
                    System.out.println("This is an invalid number.");
                    continue;
                }
                System.out.println("What base do you want to convert it to?");
                base = sc.nextInt();
                if (InvalidBase()) continue;
                System.out.print("The base " + b1 + " number, " + n1 + ", in base " + base + " is " + convert(Integer.parseInt(num)));
            }
            else if (response.equals("U")) {
                System.out.println("What number do you want to start counting from?");
                int start = sc.nextInt();
                System.out.println("What number do you want to stop at?");
                int end = sc.nextInt();
                System.out.println("What base?");
                base = sc.nextInt();
                if (InvalidBase()) continue;
                if (start < end) for (int i = start; i <= end; i++) System.out.println(i + ". " + convert(i));
                else for (int i = start; i >= end; i--) System.out.println(i + ". " + convert(i));
            }
            else if (response.equals("Q")) {
                System.out.println("Thank you for the using number converting system!");
                sc.close();
                break;
            } else System.out.println("Invalid Input");
        }
    }
}