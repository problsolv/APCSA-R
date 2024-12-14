import java.util.ArrayList;
/**
 * @author Simon Chung
 * @version 12/01/2022
 * @purpose This program uses insertion, selection, and merge sort to sort products based on
 * their name, number, price, and quantity.
 * (Client Class)
 */
public class M10_07ProductsTester {
    public static void insertionname(ArrayList<M10_07Product> food) {
        for (int i = 1; i < food.size(); i++) {
            int j = i;
            while ((j > 0) && (food.get(j).name.charAt(0) < food.get(j - 1).name.charAt(0))) {
                M10_07Product temp = food.get(j - 1);
                food.set(j - 1, food.get(j));
                food.set(j, temp);
                j--;
            }
        }
        printResults(food);
    }

    public static void selectionnumber(ArrayList<M10_07Product> food) {
        for (int i = food.size() - 1; i >= 0; i--) {
            int m = 0;
            for (int j = 0; j <= i; j++) {
                if (food.get(j).number > food.get(m).number) {
                    m = j;
                }
            }
            M10_07Product temp = food.get(i);
            food.set(i, food.get(m));
            food.set(m, temp);
        }
        printResults(food);
    }
    public static void mergesort(double[] array, int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergesort(array, low, middle);
            mergesort(array, middle + 1, high);
            int n1 = middle - low + 1, n2 = high - middle;

            double[] L = new double[n1], R = new double[n2];

            System.arraycopy(array, low, L, 0, n1);
            for (int j = 0; j < n2; ++j) {
                R[j] = array[middle + 1 + j];
            }
            int i = 0, j = 0, k = low;

            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    array[k] = L[i];
                    i++;
                }
                else {
                    array[k] = R[j];
                    j++;
                }
                k++;
            }
            while (i < n1) {
                array[k] = L[i];
                i++;
                k++;
            }
            while (j < n2) {
                array[k] = R[j];
                j++;
                k++;
            }
        }
    }

    public static void printResults(ArrayList<M10_07Product> food) {
        System.out.printf("%-14s%-14s%-12s%s%n", "Name", "Number", "Price", "Quantity");
        System.out.println("————————————————————————————————————————————————");
        for (M10_07Product item : food) {
            System.out.print(item);
        }
        System.out.println();
    }

    public static void main(String [ ] args) {
        M10_07Product cabbage = new M10_07Product("Cabbage", 4330, 3.28, 45);
        M10_07Product milk = new M10_07Product("Milk", 812433, 2.96, 114);
        M10_07Product cheese = new M10_07Product("Cheese", 88231, 3.32, 62);
        M10_07Product salmon = new M10_07Product("Salmon", 60029, 7.06, 86);
        M10_07Product broccoli = new M10_07Product("Broccoli", 4203, 1.83, 233);
        M10_07Product doritos = new M10_07Product("Doritos", 12293, 4.98, 76);
        M10_07Product popcorn = new M10_07Product("Popcorn", 134028, 4.59, 34);
        M10_07Product grapejuice = new M10_07Product("Grape Juice", 90023, 2.54, 21);
        M10_07Product coke = new M10_07Product("Coca Cola", 40054, 4.58, 78);
        M10_07Product beef = new M10_07Product("Ground Beef", 59223, 3.76, 90);
        ArrayList<M10_07Product> food = new ArrayList<>();
        food.add(cabbage);
        food.add(milk);
        food.add(cheese);
        food.add(salmon);
        food.add(broccoli);
        food.add(doritos);
        food.add(popcorn);
        food.add(grapejuice);
        food.add(coke);
        food.add(beef);

        System.out.println("<< Original Array >>");
        printResults(food);

        System.out.println("<< Sort by name >>");
        insertionname(food);

        System.out.println("<< Sort by number >>");
        selectionnumber(food);

        System.out.println("<< Sort by price >>");
        double[] temp = new double[food.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = food.get(i).price;
        }
        mergesort(temp, 0, temp.length - 1);
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < food.size(); j++) {
                if (temp[i] == food.get(j).price) {
                    M10_07Product t = food.get(i);
                    food.set(i, food.get(j));
                    food.set(j, t);
                }
            }
        }
        printResults(food);

        System.out.println("<< Sort by quantity >>");
        temp = new double[food.size()];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = food.get(i).quantity;
        }
        mergesort(temp, 0, temp.length - 1);
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < food.size(); j++) {
                if ((int)temp[i] == food.get(j).quantity) {
                    M10_07Product t = food.get(i);
                    food.set(i, food.get(j));
                    food.set(j, t);
                }
            }
        }
        printResults(food);
    }
}