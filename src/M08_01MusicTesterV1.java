/**
 * @author Simon Chung
 * @version 09/25/2022
 * @purpose This program uses sequential search to find song's titles, artists, and year produced and outputs
 * the song's information if found and null if not found.
 * (Client class)
 */
public class M08_01MusicTesterV1 {
    public static void findTitle(M08_01_02Music[] songs, String title) {
        for (M08_01_02Music song : songs) {
            if (song.getTitle().equals(title)) {
                System.out.println(song);
            }
        }
    }

    public static void findYear(M08_01_02Music[] songs, int year) {
        for (M08_01_02Music song : songs) {
            if (song.getYear() == year) {
                System.out.print(song);
            }
        }
        System.out.println();
    }

    public static void findArtist(M08_01_02Music[] songs, String artist) {
        for (M08_01_02Music song : songs) {
            if (song.getArtist().equals(artist)) {
                System.out.print(song);
            }
        }
        System.out.println();
    }

    public static void main(String [ ] args) {
        String[] titles = {"Uptown Funk", "Party in the USA", "Talk that Talk", "Butter", "Case 143",
                "Attention", "Fearless", "Love Scenario", "Blinding Lights", "Fancy"};
        int[] years = {2015, 2009, 2022, 2021, 2022, 2017, 2008, 2018, 2019, 2019};
        String[] artists = {"Mark Ronson", "Miley Cyrus", "Twice", "BTS", "Stray Kids",
                "Charlie Puth", "Taylor Swift", "iKon", "The Weeknd", "Twice"};
        M08_01_02Music[] songs = new M08_01_02Music[titles.length];
        for (int i = 0; i < songs.length; i++) {
            songs[i] = new M08_01_02Music(titles[i], years[i], artists[i]);
        }
        System.out.println("Original Music List:");
        for (M08_01_02Music song : songs) {
            System.out.print(song);
        }

        System.out.println("\n<< Search for Butter >>");
        findTitle(songs, "Butter");

        System.out.println("\n<< Search for songs in 2019 >>");
        findYear(songs, 2019);

        System.out.println("<< Search for songs by Twice >>");
        findArtist(songs, "Twice");
    }
}