/**
 * @author Simon Chung
 * @version 08/04/2022
 * @purpose This program calculates differences and averages of school supplies prices.
 * Especially written for students returning to school for the 2022-2023 school year (including myself).
 * (Implementation class)
 */
public class M06_04BTSShop {
   private final String supply;
   private final double amazon, walmart;

   public M06_04BTSShop(String name, double amazon, double walmart) {
      this.supply = name;
      this.walmart = walmart;
      this.amazon = amazon;
   }

   public String getsupply() {
      return supply;
   }

   public double getAmazon() {
      return amazon;
   }

   public double getWalmart() {
      return walmart;
   }

   public String average() {
      return String.format("%.02f", (amazon + walmart) / 2);
   }

   public String difference() {
      return String.format("%.02f", amazon - walmart);
   }

   public String toString() {
      return String.format("%-15s%-12s%-11s%-14s%s%n", getsupply(), getAmazon(), getWalmart(), difference(), average());
   }
}
