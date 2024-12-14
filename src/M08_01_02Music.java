/**
 * @author Simon Chung
 * @version 09/25/2022
 * @purpose This program uses sequential and binary search to find song's titles, artists, and year produced and outputs
 * the song's information if found and null if not found.
 * (Implementation class)
 */
public class M08_01_02Music {
    private final int year;
    private final String title, artist;

    public M08_01_02Music(String title, int year, String artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
   
    public String getArtist() {
        return artist;
    }
   
    public String toString() {
        return String.format( "%-25s %4d   %s%n", title,  year , artist);
    }
}