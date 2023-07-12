import java.util.ArrayList;
/**
 * @author Simon Chung
 * @version 09/05/2022
 * @purpose This program creates a gradebook for instructors to use.
 * It can add, remove, and replace students' scores and names.
 * (Client Class)
 */
public class M07_08GradebookTester {
    public static void changeName(ArrayList<M07_08Gradebook> students, int index, String name) {
        students.get(index).setname(name);
        printResults(students);
    }

    public static void changeScore(ArrayList<M07_08Gradebook> students, int index, int quiznumber, int score) {
        students.get(index).setscore(quiznumber, score);
        printResults(students);
    }

    public static void changeStudent(ArrayList<M07_08Gradebook> students, int index, String name, int[] scores) {
        students.set(index, new M07_08Gradebook(name, scores[0], scores[1], scores[2], scores[3], scores[4]));
        printResults(students);
    }

    public static void addStudent(ArrayList<M07_08Gradebook> students, int index, String name, int[] scores) {
        students.add(index, new M07_08Gradebook(name, scores[0], scores[1], scores[2], scores[3], scores[4]));
        printResults(students);
    }

    public static void removeStudent(ArrayList<M07_08Gradebook> students, int index) {
        students.remove(index);
        printResults(students);
    }

    public static void printResults(ArrayList<M07_08Gradebook> students) {
        System.out.printf("%n%-23s%-8s%-8s%-8s%-8s%s%n", "Student name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("—————————————————————————————————————————————————————————");
        for (M07_08Gradebook student : students) {
            System.out.println(student.toString());
        }
        System.out.println();
    }

    public static void main(String [ ] args) {
        ArrayList<M07_08Gradebook> students = new ArrayList<>();
        String[] names = {"George Washington", "John Adams", "Thomas Jefferson", "James Madison", "James Monroe"};
        int[][] scores = {{77, 89, 97, 100, 69}, {92, 89, 97, 95, 85}, {67, 90, 99, 87, 100}, {100, 92, 96, 100, 100}, {96, 97, 100, 84, 75}, {90, 100, 93, 96, 80}, {76, 79, 86, 90, 94}};
        for (int i = 0; i < names.length; i++) {
            students.add(new M07_08Gradebook(names[i], scores[i][0], scores[i][1], scores[i][2], scores[i][3], scores[i][4]));
        }

        System.out.println("Starting Gradebook:");
        printResults(students);

        System.out.println("<< Change " + students.get(2).getname() + "'s name to Aaron Burr");
        changeName(students, 2, "Aaron Burr");

        System.out.println("<< Change " + students.get(0).getname() + "'s quiz 1 score to 80 >>");
        changeScore(students, 0, 1, 80);

        System.out.println("<< Change " + students.get(4).getname() + " to John Quincy Adams >>");
        changeStudent(students, 4, "John Quincy Adams", scores[5]);

        System.out.println("<< Adding Andrew Jackson");
        addStudent(students, students.size(), "Andrew Jackson", scores[6]);

        System.out.println("<< Removing " + students.get(1).getname() + " >>");
        removeStudent(students, 1);
    }
}