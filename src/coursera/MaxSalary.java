package coursera;
import java.util.*;
public class MaxSalary {
    static String maxSalary(ArrayList<Integer> nums) {
        StringBuilder salary = new StringBuilder();
        while (!nums.isEmpty()) {
            int max = Integer.MIN_VALUE, maxIndex = 0;
            for (int i = 0; i < nums.size(); i++) {
                if (better(nums.get(i), max)) {
                    maxIndex = i;
                    max = nums.get(i);
                }
            }
            salary.append(max);
            nums.remove(maxIndex);
        }
        return salary.toString();
    }

    static boolean better(int a, int b) {
        if (b <= 0) return true;
        String stra = String.valueOf(a);
        String strb = String.valueOf(b);
        long c = Long.parseLong(stra + strb);
        long d = Long.parseLong(strb + stra);
        return c > d;
    }
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) a.add(sc.nextInt());
        System.out.println(maxSalary(a));
    }
}