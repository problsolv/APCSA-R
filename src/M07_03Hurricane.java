/**
 * @author Simon Chung
 * @version 08/24/2022
 * @purpose This program summarizes hurricane data over the past 2 decades. It shows the year of the hurricane,
 * the hurricane name, category, pressure, and wind speed.
 * (Implementation class)
 */
public class M07_03Hurricane {
   private final int year, cat, pressure;
   private final double windspeed;
   private final String name;

   public M07_03Hurricane(int year, String name, int cat, int pressure, double windspeed) {
      this.year = year;
      this.name = name;
      this.cat = cat;
      this.pressure = pressure;
      this.windspeed = windspeed;
   }

   public int getYear() {
      return year;
   }

   public String getName() {
      return name;
   }

   public int getCat() {
      return cat;
   }

   public int getPressure() {
      return pressure;
   }

   public double getWindspeed() {
      return windspeed;
   }

   public String toString() {
      return String.format("  %-10d%-19s%-14d%-16d%.02f%n", year, name, cat, pressure, windspeed);
   }
}