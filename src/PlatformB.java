import java.util.*;
/**
 * TESTING PLATFORM B
 */
public class PlatformB {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(sc.next().matches("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"));
        }
    }
}