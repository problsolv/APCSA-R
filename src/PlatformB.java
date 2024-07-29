/**
 * TESTING PLATFORM B
 */
import java.util.HashMap;
import java.util.Map;
public class PlatformB {
    public static void main(String[] args) {
        String s1 = "anagram", s2 = "grammar";
        int k = 3;
        System.out.println(isAnagram(s1, s2, k) ? "YES" : "NO");
    }

    static boolean isAnagram(String s1, String s2, int k) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        //System.out.println(map);
        for (char c : s2.toCharArray()) {
            if (map.getOrDefault(c, 0) != 0) {
                map.put(c, map.get(c) - 1);
            }
        }
        //System.out.println(map);
        return map.values().stream().mapToInt(i->i).sum() <= k;
    }
}