/**
 * @author Simon Chung
 * @version 08/21/2022
 * @purpose This program calculates ingredients needed to make a cheesecake.
 * It creates cheesecakes and uses printf statements to create the output.
 * (Implementation class)
 */
public class M07_02Cheesecake {
    private final int myQuantity, myServings, myCreamCheese, myVanilla;
    private final double mySugar;
    private final String myFlavor;

    public M07_02Cheesecake(String flavor, int quantity) {
        myFlavor = flavor;
        myQuantity = quantity;
        myServings = 16 * myQuantity;
        myCreamCheese = 32 * myQuantity;
        myVanilla = myQuantity;
        mySugar = myQuantity / 3.0;
    }

    public int getquantity() {
        return myQuantity;
    }

    public String getFlavor() {
        return myFlavor;
    }

    public double getSugar() {
        return mySugar;
    }

    public int getCreamCheese() {
        return myCreamCheese;
    }

    public int getVanilla() {
        return myVanilla;
    }

    public int getServings() {
        return myServings;
    }

    public String toString() {
        return String.format("%5d%8s%-13s%s%7d oz%5s%6d%5s%5.02f cups%2s%3d tsps%4s%n", getquantity(), "|  ", getFlavor(), "|", getCreamCheese(), "|", getServings(), "|", getSugar(), "|", getVanilla(), "|");
    }
}