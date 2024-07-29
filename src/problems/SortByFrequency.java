package problems;
import java.util.*;
public class SortByFrequency {
    static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        Integer[] n = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(n, new Frequency(freq));
        return Arrays.stream(n).mapToInt(Integer::intValue).toArray();
    }

    static class Frequency implements Comparator<Integer> {
        private final Map<Integer, Integer> FREQ;
        Frequency(Map<Integer, Integer> FREQ) {
            this.FREQ = FREQ;
        }
        @Override
        public int compare(Integer a, Integer b) {
            int compare = Integer.compare(FREQ.get(a), FREQ.get(b));
            return compare == 0 ? Integer.compare(a, b) : compare;
        }
    }

    public static void main(String [ ] args) {
        System.out.println(Arrays.toString(frequencySort(new int[]{100, 100, 100, 99, 99, 92, 98, 98, 97, 96, 97, 91, 100, 92})));
    }
}