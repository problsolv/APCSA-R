/**
 * @author Simon Chung
 * @version 09/06/2022
 * @purpose This program uses insertion and selection sort to sort movies based on their name, year produced, and production company.
 * (Implementation class)
 */
public class M07_09_10Movie {
    private final int year;
    private final String title, studio;

    public M07_09_10Movie(String title, int year, String studio) {
        this.title = title;
        this.year = year;
        this.studio = studio;
    }

    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }
    
    public int getYear() {
        return year;
    }

    public String toString() {
        return String.format("%-31s%-7d%s%n", title, year, studio);
    }
}