/**
 * @author Simon Chung
 * @version 06/22/2022
 * @purpose This program calculates differences, sums, and to reverse strings and integers.
 */
public class M04_07MathTrick {
    // STEP 1
    public static int getRandomNum() {
        int ones = 0;
        int tens = (int)(Math.random() * 10);
        int hundreds = 0;
        while (hundreds == 0) {
            hundreds = (int)(Math.random() * 10);
        }
        while ((ones == 0) || Math.abs(ones - hundreds) <= 1) {
            ones = (int)(Math.random() * 10);
        }
        return hundreds * 100 + tens * 10 + ones;
    }

    // STEP 2 AND 4
    public static int reverseDigits(int num) {
        int ones = num % 10, tens = num / 10 % 10, hundreds = num / 100 % 10;
        return ones * 100 + tens * 10 + hundreds;
    }

    // STEP 7
    public static String replaceLtr(String str) {
        String[][] replacements = {{"0", "Y"}, {"1", "M"}, {"2", "P"}, {"3", "L"},
                {"4", "R"}, {"5", "O"}, {"6", "F"}, {"7", "A"}, {"8", "I"}, {"9", "B"}};
        for (String[] replacement : replacements) {
            str = str.replace(replacement[0], replacement[1]);
        }
        return str;
    }

    // STEP 8
    public static String reverseString(String str) {
        if (str.length() == 0) {
            return "";
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    // MAIN METHOD
    public static void main(String [ ] args) {
        // STEP 1
        int step1 = getRandomNum();
        System.out.println("1.\tThe starting number is " + step1);

        // STEP 2
        int step2 = reverseDigits(step1);
        System.out.println("2.\tThe reversed number is " + step2);

        // STEP 3
        int step3 = Math.abs(step2 - step1);
        System.out.println("3.\tTheir difference is " + step3);

        // STEP 4
        int step4 = reverseDigits(step3) + step3;
        System.out.println("4.\tThe difference added to itself reversed is " + step4);

        // STEP 5
        int step5 = step4 * 1000000;
        System.out.println("5.\tThe difference multiplied by a million is " + step5);

        // STEP 6
        String step6 = String.valueOf(step5 - 733361573);
        System.out.println("6.\tThe product minus 733361573 is " + step6);

        // STEP 7
        String step7 = replaceLtr(step6);
        System.out.println("7.\tReplaced string is " + step7);

        // STEP 8
        String step8 = reverseString(step7);
        System.out.println("8.\tReversed string is " + step8);
    }
}