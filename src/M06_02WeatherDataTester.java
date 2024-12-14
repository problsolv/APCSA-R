import java.util.Scanner;
/**
 * @author Simon Chung
 * @version 07/26/2022
 * @purpose This program prints out weather and precipitation data using arrays and printf statements.
 * (Client class)
 */
public class M06_02WeatherDataTester {
    public static void printResults(String city, String state, String tempLabel, String precipLabel, double[] temperature, double[] precipitation, String[] month, double avgtemp, double totalprec) {
        System.out.println();
        System.out.printf("%28s%n", "Weather data");
        System.out.printf("%22s%8s%s%3s%n", "Location:", city, ",", state);
        System.out.printf("%-5s%18s (%S)%18s (%s)%n", "Month", "Temperature", tempLabel, "Precipitation", precipLabel);
        System.out.println("———————————————————————————————————————————————————");
        for (int i = 0; i < temperature.length; i++) {
            System.out.printf("%-16s", month[i]);
            System.out.printf("%-21.01f", temperature[i]);
            System.out.printf("%.01f%n", precipitation[i]);
        }
        System.out.println("———————————————————————————————————————————————————");
        System.out.printf("%16s%.01f", "Average: ", avgtemp);
        System.out.printf("%16s%.01f%n", "Annual: ", totalprec);
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double[] temperature = {60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63};
        double[] precipitation = {2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};
        String city = "Orlando", state = "FL";
        String tempLabel = "f";
        String precipLabel = "in.";

        M06_02WeatherData weather = new M06_02WeatherData(temperature, precipitation, month);

        System.out.print("Choose Fahrenheit or Celsius (F or C): ");
        String tempchoice = sc.next().toUpperCase();
        if (tempchoice.equals("C")) {
            tempLabel = "c";
            temperature = weather.celsiusconvert();
        }

        System.out.print("Choose Inches or Centimeters (I or C): ");
        String prechoice = sc.next().toUpperCase();
        if (prechoice.equals("C")) {
            precipLabel = "cm.";
            precipitation = weather.cmconvert();
        }

        month = weather.addperiod();
        double avgtemp = weather.avgtemp();
        double totalprec = weather.totalprec();

        printResults(city, state, tempLabel, precipLabel, temperature, precipitation, month, avgtemp, totalprec);
        sc.close();
    }
}