/**
 * @author Simon Chung
 * @version 12/01/22
 * @purpose This is a class that tests the Card class.
 */
public class M10_08CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String [ ] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      M10_08Card aceHearts = new M10_08Card("ace", "hearts", 1);
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts);
      System.out.println();

      M10_08Card tenSpades = new M10_08Card("ten", "spades", 10);
      System.out.println("**** Tests Card 1: ten of spades ****");
      System.out.println("  rank: " + tenSpades.rank());
      System.out.println("  suit: " + tenSpades.suit());
      System.out.println("  pointValue: " + tenSpades.pointValue());
      System.out.println("  toString: " + tenSpades);
      System.out.println();

      M10_08Card queenHearts = new M10_08Card("queen", "hearts", 12);
      System.out.println("**** Tests Card 3: queen of hearts ****");
      System.out.println("  rank: " + queenHearts.rank());
      System.out.println("  suit: " + queenHearts.suit());
      System.out.println("  pointValue: " + queenHearts.pointValue());
      System.out.println("  toString: " + queenHearts);
      System.out.println();

      boolean bool = queenHearts.matches(tenSpades);
      System.out.println("**** matches tests ****");
      System.out.println("Matching: " + bool);
      System.out.println("Not Matching: " + !bool);

   }
}
