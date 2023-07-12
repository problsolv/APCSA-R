/**
 * @author Simon Chung
 * @version 09/05/2022
 * @purpose This program creates a gradebook for instructors to use.
 * It can add, remove, and replace students' scores and names.
 * (Implementation Class)
 */
public class M07_08Gradebook {
    private final int[] scores;
    private String name;

    public M07_08Gradebook(String name, int quiz1, int quiz2, int quiz3, int quiz4, int quiz5) {
        scores = new int[]{quiz1, quiz2, quiz3, quiz4, quiz5};
        this.name = name;
    }

    public void setscore(int index, int score) {
        scores[index - 1] = score;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String toString() {
        return String.format("%-20s %4d%8d%8d%8d%8d", name, scores[0], scores[1], scores[2], scores[3], scores[4]);
    }
}