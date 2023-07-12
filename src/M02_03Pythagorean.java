/**
 * @author Simon Chung
 * @version 06/03/2022
 * @purpose This program uses Pythagorean Theorem to calculate the hypotenuse of a right triangle.
 * The system randomly selects 2 numbers from 5-23 inclusive and uses Pythagorean Theorem
 * to find the third side.
 */
public class M02_03Pythagorean {
    public static void main(String [ ] args) {
        int side1 = (int)(Math.random() * 18) + 5, side2 = (int)(Math.random() * 18) + 5;
        double hyp = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("Triangle 1\t\tSide 1: " + side1 + "\t\t\t\t" + "Side 2: " + side2 + "\t\t\t\t" + "Hypotenuse: " + hyp);
        side1 = (int)(Math.random() * 18) + 5;
        side2 = (int)(Math.random() * 18) + 5;
        hyp = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("Triangle 2\t\tSide 1: " + side1 + "\t\t\t\t" + "Side 2: " + side2 + "\t\t\t\t" + "Hypotenuse: " + hyp);
    }
}