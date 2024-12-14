/**
 * @author Simon Chung
 * @version 06/28/2022
 * @purpose This program calculates a car's mph over a trip to University of Florida in Gainesville
 * and the Florida State University in Tallahassee, then compares them in a table format.
 * (Implementation class)
 */
public class M05_05Ford {
    public double trip1() { // from Sanford to University of Florida
        double miles = 111; // the trip is approximately 111 miles.
        double timehrs = 2.25;
        return Double.parseDouble(String.format("%.02f", (miles / timehrs)));
    }

    public double trip2() { // from Sanford to Florida State University (Tallahassee)
        double miles = 257; // the trip is approximately 257 miles.
        double timehrs = 4.41;
        return Double.parseDouble(String.format("%.02f", (miles / timehrs)));
    }
}