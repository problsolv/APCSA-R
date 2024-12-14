/**
 * @author Simon Chung
 * @version 08/27/2022
 * @purpose This program calculates election results and data for the Election of 1860.
 * It uses arrays, traversal, and replacement methods to create candidates and the number of votes they received.
 * (Client Class)
 */
public class M07_04CandidatesTesterV1 {
    public static void changeName(M07_04_07Candidates[] candidates, String find, String replace) {
        for (M07_04_07Candidates candidate : candidates) {
            if (candidate.getName().equals(find)) {
                candidate.setName(replace);
            }
        }
        printResults(candidates);
    }

    public static void changeVotes(M07_04_07Candidates[] candidates, int find, int replace) {
        for (M07_04_07Candidates candidate : candidates) {
            if (candidate.getVotes() == find) {
                candidate.setVotes(replace);
            }
        }
        printResults(candidates);
    }

    public static void changeBoth(M07_04_07Candidates[] candidates, String namefind, String namereplace, int votesfind, int votesreplace) {
        for (M07_04_07Candidates candidate : candidates) {
            if (candidate.getName().equals(namefind)) {
                candidate.setName(namereplace);
            }
            if (candidate.getVotes() == votesfind) {
                candidate.setVotes(votesreplace);
            }
        }
        printResults(candidates);
    }

    public static void printResults(M07_04_07Candidates[] candidates) {
        System.out.printf("%25s%20s%n", "Votes", "% of Total");
        System.out.printf("%-19s%s%16s%n", "Candidate", "Received", "Votes");
        System.out.println("—————————————————————————————————————————————");
        int totalvotes = 0;
        for (M07_04_07Candidates candidate : candidates) {
            totalvotes += candidate.getVotes();
        }
        for (M07_04_07Candidates candidate : candidates) {
            System.out.print(candidate.toString(totalvotes));
        }
        System.out.println("\nThe total number of votes is: " + totalvotes + "\n");
    }

    public static void main(String [ ] args) {
        String[] runners = {"Abraham Lincoln", "Stephen Douglas", "John Breckinridge", "John Bell", "Other candidates"};
        int[] votes = {1865908, 1380202, 848019, 590901, 531};
        M07_04_07Candidates[] candidates = new M07_04_07Candidates[runners.length];
        for (int i = 0; i < candidates.length; i++) {
            candidates[i] = new M07_04_07Candidates(runners[i], votes[i]);
        }
        System.out.println("Original Results:");
        printResults(candidates);

        System.out.println("<< Changing Stephen Douglas to Henry Clay >>");
        changeName(candidates, candidates[1].getName(), "Henry Clay");

        System.out.println("<< Changing John Bell's votes to 600000 >>");
        changeVotes(candidates, candidates[3].getVotes(), 600000);

        System.out.println("<< Changing John Breckinridge to Dred Scott, Abraham Lincoln's votes to 2000000 >>");
        changeBoth(candidates, candidates[2].getName(), "Dred Scott", candidates[0].getVotes(), 2000000);
    }
}