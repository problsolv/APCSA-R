/**
 * @author Simon Chung
 * @version 06/24/2022
 * @purpose This program calculates different planets' surface gravity
 * using print, methods, and math libraries.
 */
public class M05_02PlanetGravity {
    public static double surfacegravity(double diameter, double mass) {
        double radius = diameter / 2;
        return (6.67 * Math.pow(10, -11)) * mass / Math.pow(radius, 2);
    }

    public static String header(int loop) {
        String line1 = tab(loop) + "Planetary Data\n";
        loop -= 3;
        String line2 = "Planet" + tab(loop) + "Diameter (km)" + tab(loop) + "Mass (kg)" + tab(loop) + "g (m/s^2)\n";
        String line3 = "—————————————————————————————————————————————————————————\n";
        return line1 + line2 + line3;
    }

    public static void results(String planet, double diameter, double mass, double surfacegravity, int loop) {
        String mass_string = String.valueOf(mass);
        while (mass_string.length() > 7) {
            String target = mass_string.substring(3, 4);
            mass_string = mass_string.replace(target, "");
        }
        mass = Double.parseDouble(mass_string.substring(0, 4)) + 0.02;
        mass_string = mass + mass_string.substring(loop + 1);
        System.out.println(planet + tab(loop - 1) + diameter + tab(loop) + mass_string + tab(loop) + String.format("%.02f", surfacegravity));
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
        String planet = "Jupiter";
        double diameter = 142984 * 1000, mass = 1.9 * Math.pow(10, 27);
        System.out.print(header(5));
        results(planet, diameter, mass, surfacegravity(diameter, mass), 3);
    }
}