/**
 * @author Simon Chung
 * @version 06/28/2022
 * @purpose This program calculates a car's mph over a trip to University of Florida in Gainesville
 * and the Florida State University in Tallahassee, then compares them in a table format.
 * (Client class)
 */
public class M05_05FordTester {
    public static String average(double trip1, double trip2) {
        return String.format("%.02f", (trip1 + trip2) / 2);
    }

    public static double difference(double trip1, double trip2) {
        String diff = String.format("%.02f", trip1 - trip2);
        if (diff.contains("-")) {
            return Double.parseDouble(diff.replace("-", ""));
        }
        return Double.parseDouble(diff);
    }

    public static String tab(int loop) {
        StringBuilder tab = new StringBuilder();
        while (loop > 0) {
            loop--;
            tab.append("\t");
        }
        return tab.toString();
    }

    public static void main(String [ ] args) {
        int loop = 2;
        String car_brand = "Ford";
        M05_05Ford new_car = new M05_05Ford();
        double speed = new_car.trip1();
        double speed2 = new_car.trip2();
        System.out.println(tab(loop + 2) + car_brand + " speeds:");
        System.out.println("UF trip" + tab(loop) + "FSU trip" + tab(loop - 1) + "Average" + tab(loop) + "Difference");
        System.out.println(speed + tab(loop) + speed2 + tab(loop) + average(speed, speed2) + tab(loop) + difference(speed, speed2));
    }
}