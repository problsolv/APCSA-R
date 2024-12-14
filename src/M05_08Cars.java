/**
 * @author Simon Chung
 * @version 07/01/2022
 * @purpose This program calculates 3 cars' mph over a trip to University of Florida in Gainesville
 * and the Florida State University in Tallahassee, then compares them in a table format.
 * This is an improved version of 5.05, where there was only 1 car tested.
 * (Implementation class)
 */
public class M05_08Cars {
    public double trip1(double timehrs) { // from Sanford to University of Florida
       return Double.parseDouble(String.format("%.02f", 111 / timehrs)); // the trip is approximately 111 miles.
    }

    public double trip2(double timehrs) { // from Sanford to Florida State University (Tallahassee)
       return Double.parseDouble(String.format("%.02f", 257 / timehrs)); // the trip is approximately 257 miles.
    }
}