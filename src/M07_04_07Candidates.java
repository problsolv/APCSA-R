/**
 * @author Simon Chung
 * @version 08/31/2022
 * @purpose This program calculates election results and data for the Election of 1860.
 * It uses ArrayList, arrays and traversal, replacement, insertion, and deletion methods to create candidates and the number of votes they received.
 * (Implementation Class)
 */
public class M07_04_07Candidates {
    private int votes;
    private String name;

    public M07_04_07Candidates(String name, int votes) {
        this.name = name;
        this.votes = votes;
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(int total) {
        return String.format("%-20s%-18d%.2f%n", name, votes, 100.0 * votes / total);
    }
}