import java.util.regex.*;
/**
 * TESTING PLATFORM B
 */
public class PlatformB {
    public static void main(String [ ] args) {
        String pattern = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        System.out.println("192.168.1.255".matches(pattern));
        String regexThree = "n";
        Pattern pThree = Pattern.compile(regexThree);
        Matcher mThree = pThree.matcher("simon.chung.1");
        mThree.find(6);
        System.out.println(mThree.start());
        System.out.println(mThree.end());
    }
}