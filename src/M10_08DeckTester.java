/**
 * @author Simon Chung
 * @version 12/01/22
 * @purpose This is a class that tests the Deck class.
 */

public class M10_08DeckTester {
   /**
    * The main method in this class checks the Deck operations for consistency.
    * @param args is not use myDeck.
    */
   public static void main(String [ ] args) {

      String[] myRanks = {"king", "queen", "jack"};
      String[] mySuits = {"spades", "hearts", "clubs", "spades"};
      int[] myPointValues = {13, 12, 11};
      M10_08Deck myDeck = new M10_08Deck(myRanks, mySuits, myPointValues);

      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + myDeck);
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      int j = myDeck.size();
      for (int i = 0; i <= j; i++) {
         System.out.println("**** Deal a Card ****");
         System.out.println("  deal: " + myDeck.deal());

         System.out.println("**** Deck Methods After " + i + " Card(s) Dealt ****");
         System.out.println("  toString:\n" );
         System.out.println("  isEmpty: " + myDeck.isEmpty());
         System.out.println("  size: " + myDeck.size());
         System.out.println();
      }
   }
}