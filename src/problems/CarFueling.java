package problems;
import java.util.Scanner;
public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int origTank = tank, times = 0;
        int[] distances = new int[stops.length + 1];
        distances[0] = stops[0];
        for (int i = 1; i < stops.length; i++) {
            distances[i] = stops[i] - stops[i - 1];
        }
        distances[distances.length - 1] = dist - stops[stops.length - 1];
        for (int i : distances) if (i > tank) return -1;
        int i = 0;
        while (dist > 0 && i < distances.length - 1) {
            tank -= distances[i];
            dist -= distances[i];
            if (tank < distances[i + 1]) {
                times++;
                tank = origTank;
            }
            i++;
        }
        return times;
    }
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int dist = sc.nextInt(), tank = sc.nextInt(), n = sc.nextInt();
        int[] stops = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = sc.nextInt();
        }
        System.out.println(computeMinRefills(dist, tank, stops));
    }
}