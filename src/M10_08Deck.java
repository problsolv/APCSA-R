import java.util.*;
/**
 * @author Simon CHung
 * @version 12/01/22
 * @purpose The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class M10_08Deck {
   private final List<M10_08Card> CARDS;    //contains all the cards in the deck

   private int size;   // size is the number of not-yet-dealt cards.
                       // Cards are dealt from the top (the highest index) down.
                       // The next card to be dealt is at size - 1.

   /**
    * Creates a new Deck instance.<BR>
    * It pairs each element of ranks with each element of suits,
    * and produces one of the corresponding card.
    * @param ranks is an array containing all the card ranks.
    * @param suits is an array containing all the card suits.
    * @param values is an array containing all the card point values.
    */
   public M10_08Deck(String[] ranks, String[] suits, int[] values) {
      CARDS = new ArrayList<>();
      for (int i = ranks.length - 1; i >= 0; i--) {
         for (int j = suits.length - 1; j >= 0; j--) {
            CARDS.add(new M10_08Card(ranks[i], suits[j], values[i]));
         }
      }
      size = CARDS.size();
   }

   /**
    * Determines if this deck is empty (no undealt cards).
    * @return true if this deck is empty, false otherwise.
    */
   public boolean isEmpty() {
      return CARDS.isEmpty();
   }

   /**
    * Accesses the number of undealt cards in this deck.
    * @return the number of undealt cards in this deck.
    */
   public int size() {
      return size;
   }

   /*
     Randomly permute the given collection of cards
     and reset the size to represent the entire deck.
    */
   //public void shuffle()
   //{
      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
      /* For Activity 2, this method will do nothing. */
   //}

   /**
    * Deals a card from this deck.
    * @return the card just dealt, or null if all the cards have been
    *         previously dealt.
    */
   public M10_08Card deal() {
      if (this.size() == 0) {
         return null;
      }
      size--;
      return CARDS.get(size);
   }

   /**
    * Generates and returns a string representation of this deck.
    * @return a string representation of this deck.
    */
   @Override
   public String toString() {
      StringBuilder rtn = new StringBuilder("size = " + size + "\nUndealt cards: \n");

      for (int k = size - 1; k >= 0; k--) {
         rtn.append(CARDS.get(k));
         if (k != 0) {
            rtn.append(", ");
         }
         if ((size - k) % 2 == 0) {
            rtn.append("\n");
         }
      }

      rtn.append("\nDealt cards: \n");
      for (int k = CARDS.size() - 1; k >= size; k--) {
         rtn.append(CARDS.get(k));
         if (k != size) {
            rtn.append(", ");
         }
         if ((k - CARDS.size()) % 2 == 0) {
            rtn.append("\n");
         }
      }
      rtn.append("\n");
      return rtn.toString();
   }
}
