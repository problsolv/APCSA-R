/**
 * @author Simon Chung
 * @version 05/31/2022
 * @purpose This program calculates the average test grades and total points for each test added.
 */
public class M01_12Grades {
    public static void main(String [ ] args) {
        int numTests = 0, totalPoints = 0;
        int[] grades = {95, 73, 91, 82, 100, 97, 94, 88, 96, 100};
        for (int grade : grades) {
            numTests++;
            totalPoints += grade;
            double average = totalPoints / (numTests + 0.0);
            System.out.println("Test #" + numTests + " \t\tTest Grade: " + grade + "\t\tTotal Points: " + totalPoints + "\t\tAverage Score: " + String.format("%.02f",average));
        }
    }
}