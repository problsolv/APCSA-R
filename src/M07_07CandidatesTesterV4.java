import java.util.ArrayList;
/**
 * @author Simon Chung
 * @version 08/31/2022
 * @purpose This program calculates election results and data for the Election of 1860.
 * It uses ArrayList, insertion, and deletion methods to create candidates and the number of votes they received.
 * (Client Class)
 */
public class M07_07CandidatesTesterV4 {
    public static void insert(ArrayList<M07_04_07Candidates> candidates, int index, String name, int votes) {
        candidates.add(index, new M07_04_07Candidates(name, votes));
        printResults(candidates);
    }

    public static void insertbyName(ArrayList<M07_04_07Candidates> candidates, String find, String name, int votes) {
        int location = 0;
        while (!candidates.get(location).getName().equals(find)) {
            location++;
        }
        candidates.add(location, new M07_04_07Candidates(name, votes));
        printResults(candidates);
    }

    public static void delete(ArrayList<M07_04_07Candidates> candidates, int index) {
        candidates.remove(index);
        printResults(candidates);
    }

    public static void deletebyName(ArrayList<M07_04_07Candidates> candidates, String find) {
        int location = 0;
        while (!candidates.get(location).getName().equals(find)) {
            location++;
        }
        candidates.remove(location);
        printResults(candidates);
    }

    public static void printResults(ArrayList<M07_04_07Candidates> candidates) {
        System.out.printf("%25s%20s%n", "Votes", "% of Total");
        System.out.printf("%-19s%s%16s%n", "Candidate", "Received", "Votes");
        System.out.println("—————————————————————————————————————————————");
        int totalvotes = 0;
        for (M07_04_07Candidates candidate : candidates) {
            if (candidate != null) {
                totalvotes += candidate.getVotes();
            }
        }
        for (M07_04_07Candidates candidate : candidates) {
            if (candidate != null) {
                System.out.print(candidate.toString(totalvotes));
            }
        }
        System.out.println("\nThe total number of votes is: " + totalvotes + "\n");
    }

    public static void main(String [ ] args) {
        ArrayList<M07_04_07Candidates> candidates = new ArrayList<>();
        String[] runners = {"Abraham Lincoln", "Stephen Douglas", "John Breckinridge", "John Bell", "Other candidates"};
        int[] votes = {1865908, 1380202, 848019, 590901, 531};
        for (int i = 0; i < runners.length; i++) {
            candidates.add(new M07_04_07Candidates(runners[i], votes[i]));
        }
        System.out.println("Original Results:");
        printResults(candidates);

        System.out.println("<< In Position 3, add Henry Clay, 729586 votes >>");
        insert(candidates, 3, "Henry Clay", 729586);

        System.out.println("<< Before Stephen Douglas, add Dred Scott, 1539457 votes >>");
        insertbyName(candidates, "Stephen Douglas", "Dred Scott", 1539457);

        System.out.println("<< Remove Position 5 >>");
        delete(candidates, 5);

        System.out.println("<< Remove John Breckinridge >>");
        deletebyName(candidates, "John Breckinridge");
    }
}