package coursera;
public class BaseConvert {
    static String convert(int num, int base) {
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8',
                '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
                'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        if (num == 0) return "";
        return convert(num / base, base) + ch[num % base];
    }

    private static int getValue(char ch) {
        if (ch >= 'A' && ch <= 'Z') return (int) ch - 55;
        return Integer.parseInt(String.valueOf(ch));
    }

    private static long revert(String num, int place_value, int fin, int base) {
        if (num.isEmpty()) return fin;
        fin += getValue(num.charAt(num.length() - 1)) * place_value;
        return revert(num.substring(0, num.length() - 1), place_value * base, fin, base);
    }

    static long revert(String num, int base) {
        return revert(num.toUpperCase(), 1, 0, base);
    }

    public static void main(String [ ] args) {
        System.out.println(convert(5, 2));
        System.out.println(revert("ff", 16));
    }
}