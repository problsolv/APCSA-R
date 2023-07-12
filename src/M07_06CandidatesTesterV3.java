/**
 * @author Simon Chung
 * @version 08/31/2022
 * @purpose This program calculates election results and data for the Election of 1860.
 * It uses arrays, insertion, and deletion methods to create candidates and the number of votes they received.
 * (Client Class)
 */
public class M07_06CandidatesTesterV3 {
    public static M07_04_07Candidates[] insert(M07_04_07Candidates[] candidates, int index, String name, int votes) {
        M07_04_07Candidates last = candidates[candidates.length - 1];
        for (int i = candidates.length - 1; i > index; i--) {
            candidates[i] = candidates[i - 1];
        }
        candidates[index] = new M07_04_07Candidates(name, votes);
        M07_04_07Candidates[] newarr = new M07_04_07Candidates[candidates.length + 1];
        System.arraycopy(candidates, 0, newarr, 0, candidates.length);
        newarr[candidates.length] = last;
        return newarr;
    }

    public static M07_04_07Candidates[] insertbyName(M07_04_07Candidates[] candidates, String find, String name, int votes) {
        int location = 0;
        M07_04_07Candidates last = candidates[candidates.length - 1];
        for (int index = 0; index < candidates.length; index++) {
            if (candidates[index].getName().equals(find)) {
                location = index;
            }
        }

        for (int index = candidates.length - 1; index > location; index--) {
            candidates[index] = candidates[index - 1];
        }

        candidates[location] = new M07_04_07Candidates(name, votes);
        M07_04_07Candidates[] newarr = new M07_04_07Candidates[candidates.length + 1];
        System.arraycopy(candidates, 0, newarr, 0, candidates.length);
        newarr[candidates.length] = last;
        return newarr;
    }

    public static void delete(M07_04_07Candidates[] candidates, int index) {
        if ((index > 0) && (index < candidates.length)) {
            for (int i = index; i < candidates.length -1; i++) {
                candidates[i] = candidates[i + 1];
            }

            candidates[candidates.length - 1] = null;
        }
        printResults(candidates);
    }

    public static void deletebyName(M07_04_07Candidates[] candidates, String find) {
        int location = 0;
        for (int i = 0; i < candidates.length; i++) {
            if ((candidates[i] != null) && (candidates[i].getName().equals(find))) {
                location = i;
                break;
            } else if (candidates[i] == null) {
                location = -1;
                break;
            }
        }

        if (location >= 0) {
            for (int i = location; i < candidates.length - 1; i++) {
                candidates[i] = candidates[i + 1];
            }
            candidates[candidates.length - 1] = null;
        }
        printResults(candidates);
    }

    public static void printResults(M07_04_07Candidates[] candidates) {
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
        String[] runners = {"Abraham Lincoln", "Stephen Douglas", "John Breckinridge", "John Bell", "Other candidates"};
        int[] votes = {1865908, 1380202, 848019, 590901, 531};
        M07_04_07Candidates[] candidates = new M07_04_07Candidates[runners.length];
        for (int i = 0; i < candidates.length; i++) {
            candidates[i] = new M07_04_07Candidates(runners[i], votes[i]);
        }
        System.out.println("Original Results:");
        printResults(candidates);

        System.out.println("<< In Position 3, add Henry Clay, 729586 votes >>");
        candidates = insert(candidates, 3, "Henry Clay", 729586);
        printResults(candidates);

        System.out.println("<< Before Stephen Douglas, add Dred Scott, 1539457 votes >>");
        candidates = insertbyName(candidates, "Stephen Douglas", "Dred Scott", 1539457);
        printResults(candidates);

        System.out.println("<< Remove Position 5 >>");
        delete(candidates, 5);

        System.out.println("<< Remove John Breckinridge >>");
        deletebyName(candidates, "John Breckinridge");
    }
}