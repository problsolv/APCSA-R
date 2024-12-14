import java.util.Scanner;
/**
 * @author Simon Chung
 * @version 06/15/2022
 * @purpose This program asks the user for their BMR and other information, then asks for how much
 * exercise or labor they get in order to calculate their active factor or total daily energy expenditure.
 */
public class M03_07TDEE {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Gender (M or F): ");
        String gender = sc.next().toUpperCase();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Height in feet & inches (for example, 5 4): ");
        int height_feet = sc.nextInt();
        int height_inches = sc.nextInt();

        System.out.print("Weight in pounds: ");
        double weight = sc.nextDouble() * 0.45359237;

        System.out.print("\nSelect Your Activity Level\n");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.print("[C] Light (Sitting, Standing)\n");
        System.out.println("[D] Moderate (Light Manual labor, Dancing, Riding Bike)");
        System.out.print("[E] Very Active (Team Sports, Hard Manual Labor)\n");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
        System.out.print("\nEnter the letter corresponding to your activity level: ");
        String active = sc.next().toUpperCase();
        double active_factor;
        int bmrvar;
        String level;
        if (gender.equals("M")) {
            bmrvar = 5;
            switch (active) {
                case "A":
                    active_factor = 1;
                    level = "Resting";
                    break;
                case "B":
                    active_factor = 1.3;
                    level = "Restricted Mobility";
                    break;
                case "C":
                    active_factor = 1.6;
                    level = "Light Mobility";
                    break;
                case "D":
                    active_factor = 1.7;
                    level = "Moderate Labor";
                    break;
                case "E":
                    active_factor = 2.1;
                    level = "Very Active";
                    break;
                default:
                    active_factor = 2.4;
                    level = "Extremely Active";
                    break;
            }
        }
        else {
            bmrvar = -161;
            switch (active) {
                case "A":
                    active_factor = 1;
                    level = "Resting";
                    break;
                case "B":
                    active_factor = 1.3;
                    level = "Restricted Mobility";
                    break;
                case "C":
                    active_factor = 1.5;
                    level = "Light Mobility";
                    break;
                case "D":
                    active_factor = 1.6;
                    level = "Moderate Labor";
                    break;
                case "E":
                    active_factor = 1.9;
                    level = "Very Active";
                    break;
                default:
                    active_factor = 2.2;
                    level = "Extremely Active";
                    break;
            }
        }
        double height = 2.54 * (height_feet * 12 + height_inches);
        double bmr = (10 * weight) + (6.25 * height) - (5 * age) + bmrvar;
        double tdee = bmr * active_factor;

        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        if (name.contains(" ")) {
            String firstname = name.substring(0, name.indexOf(" "));
            String lastnamefc = name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2).toUpperCase();
            String lastnamere = name.substring(name.indexOf(" ") + 2);
            name = firstname + " " + lastnamefc + lastnamere;
        }

        System.out.println("\n\nYour results:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Weight (KG): " + String.format("%.02f", weight));
        System.out.println("Height (CM): " + height);
        System.out.println("BMR: " + String.format("%.02f", bmr));
        System.out.println("Activity level: " + active + " (" + level + ")");
        System.out.println("Active factor: " + active_factor);
        System.out.println("TDEE: " + String.format("%.02f", tdee));
    }
}