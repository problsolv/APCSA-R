import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * @author Simon Chung
 * @version 08/24/2022
 * @purpose This program summarizes hurricane data over the past 2 decades. It shows the year of the hurricane,
 * the hurricane name, category, pressure, and wind speed.
 * (Client class)
 */
public class M07_03HurricaneTester {
    // Method for getting minimum and maximum values at the end of the program.
    public static double MinMax(ArrayList<Double> a, boolean bool) {
        double min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (double element : a) {
            if (element < min) {
                min = element;
            }
            if (element > max) {
                max = element;
            }
        }
        // bool true -> return min, false -> return max
        return (bool) ? min : max;
    }

    public static void main(String [ ] args) throws IOException {
        int numValues = 0;
        File file = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(file);
        // reading the text file
        while (inFile.hasNextLine()) {
            inFile.nextLine();
            numValues++;
        }

        int[] years = new int[numValues];
        String[] months = new String[numValues];
        int[] pressures = new int[numValues];
        double[] windSpeeds = new double[numValues];
        String[] names = new String[numValues];
        int[] categories = new int[numValues];

        inFile = new Scanner(file);
        int index = 0;
        while (inFile.hasNext()) {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }

        for (int i = 0; i < windSpeeds.length; i++) {
            windSpeeds[i] *= 1.15078;
            if (74 > windSpeeds[i]) {
                categories[i] = 0;
            } else if ((74 <= windSpeeds[i]) && (windSpeeds[i] <= 95)) {
                categories[i] = 1;
            } else if ((95 < windSpeeds[i]) && (windSpeeds[i] <= 110)) {
                categories[i] = 2;
            } else if ((110 < windSpeeds[i]) && (windSpeeds[i] <= 129)) {
                categories[i] = 3;
            } else if ((129 < windSpeeds[i]) && (windSpeeds[i] <= 156)) {
                categories[i] = 4;
            } else {
                categories[i] = 5;
            }
        }

        ArrayList<M07_03Hurricane> hurricanes = new ArrayList<>();
        for (int i = 0; i < numValues; i++) {
            M07_03Hurricane hurricane = new M07_03Hurricane(years[i], names[i], categories[i], pressures[i], windSpeeds[i]);
            hurricanes.add(hurricane);
        }

        inFile = new Scanner(System.in);
        System.out.print("What year do you want to start from? ");
        int startyr = inFile.nextInt();
        while (startyr < 1995 || startyr > 2019) {
            System.out.println("Your starting year MUST be from 1995-2019.");
            System.out.print("Please enter another year between 1995 and 2019. ");
            startyr = inFile.nextInt();
        }
        System.out.print("What year do you want to end? ");
        int endyr = inFile.nextInt();
        while (endyr < startyr || endyr > 2019) {
            System.out.println("Your ending year MUST be from " + startyr + "-2019.");
            System.out.print("Please enter another year between " + startyr + " and 2019. ");
            endyr = inFile.nextInt();
            System.out.println();
        }

        System.out.printf("%n%35s %d - %d%n%n", "Hurricanes", startyr, endyr);
        System.out.printf("  %-10s%-16s%-14s%-17s%s%n", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
        System.out.println("—————————————————————————————————————————————————————————————————————————————————");

        int count = 0, total = 0, categorycount = 0, pressurecount = 0;
        double windspeedcount = 0;
        ArrayList<Double> pressurearray = new ArrayList<>();
        ArrayList<Double> windspeedarray = new ArrayList<>();
        ArrayList<Double> categoryarray = new ArrayList<>();
        inFile = new Scanner(file);
        while (inFile.hasNext()) {
            int yr = inFile.nextInt();
            inFile.next();
            inFile.nextInt();
            inFile.nextInt();
            inFile.next();
            if((yr >= startyr) && (yr <= endyr)) {
                M07_03Hurricane hurricane = hurricanes.get(count);
                System.out.print(hurricane);
                categorycount += hurricane.getCat();
                pressurecount += hurricane.getPressure();
                windspeedcount += hurricane.getWindspeed();
                categoryarray.add((double)hurricane.getCat());
                pressurearray.add((double)hurricane.getPressure());
                windspeedarray.add(hurricane.getWindspeed());
                total++;
            }
            count++;
        }

        System.out.println("—————————————————————————————————————————————————————————————————————————————————");
        System.out.printf("%15s%-16s%-14.01f%-16.01f", "Average", ":", (double)categorycount / total, (double)pressurecount / total);
        System.out.printf("%.02f%n", windspeedcount / total);

        System.out.printf("%15s%-16s%-14d%-16d", "Minimum", ":", (int) MinMax(categoryarray, true), (int) MinMax(pressurearray, true));
        System.out.printf("%.02f%n", MinMax(windspeedarray, true));

        System.out.printf("%15s%-16s%-14d%-16d", "Maximum", ":" , (int) MinMax(categoryarray, false), (int) MinMax(pressurearray, false));
        System.out.printf("%.02f%n", MinMax(windspeedarray, false));

        // prints the summary of categories
        System.out.println("\nSummary of Categories:");
        int[] cats = new int[5];
        for (double category : categoryarray) {
            if (category == 1) {
                cats[0]++;
            } else if (category == 2) {
                cats[1]++;
            } else if (category == 3) {
                cats[2]++;
            } else if (category == 4) {
                cats[3]++;
            } else {
                cats[4]++;
            }
        }
        for (int i = 0; i < cats.length; i++) {
            System.out.printf("%5s %d: %d%n", "Cat", i + 1, cats[i]);
        }
        inFile.close();
    }
}