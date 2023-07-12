import java.util.ArrayList;
/**
 * @author Simon Chung
 * @version 08/21/2022
 * @purpose This program calculates ingredients needed to make a cheesecake.
 * It creates cheesecakes and uses printf statements to create the output.
 * (Client class)
 */
public class M07_02CheesecakeTester {
    public static void main(String [ ] args) {
        ArrayList<M07_02Cheesecake> cakes = new ArrayList<>();
        String[] flavor = {"Blueberry", "Cherry", "Grape", "Mango", "Peach", "Strawberry"};
        int[] quantity = {6, 4, 5, 2, 1, 3};
        for (int i = 0; i < flavor.length; i++) {
            cakes.add(new M07_02Cheesecake(flavor[i], quantity[i]));
        }

        System.out.println(" |       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println(" | Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println(" |———————|——————————|———————————————|——————————————|——————————|———————————|———————————|");

        for (int i = 0; i < cakes.size(); i++) {
            System.out.printf("%2s%4d%4s%s", "|", i, "|", cakes.get(i));
        }
    }
}