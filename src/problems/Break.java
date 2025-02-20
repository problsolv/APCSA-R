package problems;

import java.util.*;

public class Break {
    public static int divisibleSumPairs(List<Integer> ar) {
        Map<Integer, Integer> map = new HashMap<>();
        int c = 0;

        for (int i : ar) {
            int v = i % 3;
            int opp = (v == 0) ? 0 : 3 - v;

            if (map.containsKey(opp)) {
                c += map.get(opp);
            }

            map.put(v, map.getOrDefault(v, 0) + 1);
            //System.out.println(map);
        }


        return c;

    }
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n --> 0) {
            int c = sc.nextInt();
            List<Integer> l = new ArrayList<>();
            while (c --> 0) {
                l.add(sc.nextInt());
            }
            System.out.println(divisibleSumPairs(l));

        }
    }
}
