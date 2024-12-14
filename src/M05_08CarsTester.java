/**
 * @author Simon Chung
 * @version 07/01/2022
 * @purpose This program calculates 3 cars' mph over a trip to University of Florida in Gainesville
 * and the Florida State University in Tallahassee, then compares them in a table format.
 * This is an improved version of 5.05, where there was only 1 car tested.
 * (Client class)
 */
public class M05_08CarsTester {
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

    public static void loop(M05_08Cars car, String car_brand, double uf, double fsu, int loop) {
        uf = car.trip1(uf);
        fsu = car.trip2(fsu);
        System.out.println(car_brand + tab(loop) + uf + tab(loop) + fsu + tab(loop) + average(uf, fsu) + tab(loop) + difference(uf, fsu));
    }

    public static void main(String [ ] args) {
        int loop = 2;
        System.out.println(tab(loop + 2) + "Speeds of different cars:\n" + tab(loop + 1) + "UF trip" + tab(loop) + "FSU trip"+ tab(loop - 1) + "Average" + tab(loop) + "Difference");
        double[] uf = {2.25, 1.89, 2.03};
        double[] fsu = {4.41, 4.62, 4.35};
        String[] car_brand = {"Ford", "Tesla", "Honda"};
        for (int index = 0; index < car_brand.length; index++) {
            loop(new M05_08Cars(), car_brand[index], uf[index], fsu[index], loop);
        }
    }
}