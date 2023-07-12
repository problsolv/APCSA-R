import java.util.Scanner;
/**
 * @author Simon Chung
 * @version 06/14/2022
 * @purpose This program asks the user for their height and weight and calculates their BMI accordingly.
 */
public class M03_05BMI {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Body Mass Index Calculator\n");
        System.out.print("Enter your name (First Last): ");
        String name = sc.nextLine();
        System.out.print("Enter your weight in pounds (e.g. 175): ");
        double weight = sc.nextDouble() / 2.205;
        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        int height_feet = sc.nextInt(), height_inches = sc.nextInt();

        double height = ((height_feet * 12) + height_inches) / 39.37;

        double bmi = weight / Math.pow(height, 2);

        String category;

        if (bmi < 18.5) {
            category = "Underweight";
        }
        else if (bmi < 24.9) {
            category = "Normal/Healthy";
        }
        else if (bmi < 29.9) {
            category = "Overweight";
        }
        else {
            category = "Obese";
        }
        System.out.println("\nYour results:");
        System.out.println("============================");
        System.out.println("Name: " + name);
        System.out.println("Height (m): " + String.format("%.01f", height));
        System.out.println("Weight (kg): " + String.format("%.01f", weight));
        System.out.println("BMI: " + String.format("%.01f", bmi));
        System.out.println("Category: " + category);
        sc.close();
    }
}