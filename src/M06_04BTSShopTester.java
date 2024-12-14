/**
 * @author Simon Chung
 * @version 08/04/2022
 * @purpose This program calculates differences and averages of school supplies prices.
 * Especially written for students returning to school for the 2022-2023 school year (including myself).
 * (Client class)
 */
public class M06_04BTSShopTester {
   public static void main (String [ ] args) {
       String[] stationery = {"1\" Binders", "#2 Pencils", "Blue Pens", "Backpacks", "Notebooks"};
       double[] amazon = {2.97, 14.49, 18.88, 27.99, 0.77};
       double[] walmart = {2.88, 25.1, 19.59, 16.1, 0.5};
       M06_04BTSShop[] supplies = new M06_04BTSShop[stationery.length];
       for (int i = 0; i < supplies.length; i++) {
           supplies[i] = new M06_04BTSShop(stationery[i], amazon[i], walmart[i]);
       }
       
       System.out.printf("%44s%n", "Back to school supply prices");
       System.out.printf("%9s%12s%13s%14s%11s%n", "Supply", "Amazon", "Walmart", "Difference", "Average");
       System.out.println("—————————————————————————————————————————————————————————————");
       
       for (M06_04BTSShop supply: supplies) {
           System.out.print(supply);
       }
   }
}