/**
 * @author Simon Chung
 * @version 09/26/2022
 * @purpose This program uses binary search to find song's titles, artists, and year produced and outputs
 * the song's information if found and null if not found.
 * (Client class)
 */
public class M08_02MusicTesterV2 {
    public static void insertion(M08_01_02Music[] songs, int c) {
        for (int i = 1; i < songs.length; i++) {
            int j = i;
            if (c == 0) {
                while ((j > 0) && (songs[j].getTitle().compareTo(songs[j - 1].getTitle()) < 0)) {
                    M08_01_02Music temp = songs[j - 1];
                    songs[j - 1] = songs[j];
                    songs[j] = temp;
                    j--;
                }
            }
            else if (c == 1) {
                while ((j > 0) && (songs[j].getYear() < songs[j - 1].getYear())) {
                    M08_01_02Music temp = songs[j - 1];
                    songs[j - 1] = songs[j];
                    songs[j] = temp;
                    j--;
                }
            }
            else {
                while ((j > 0) && (songs[j].getArtist().compareTo(songs[j - 1].getArtist()) < 0)) {
                    M08_01_02Music temp = songs[j - 1];
                    songs[j - 1] = songs[j];
                    songs[j] = temp;
                    j--;
                }
            }
        }
    }

    public static void findTitle(M08_01_02Music[] songs, String title) {
        insertion(songs, 0);
        int high = songs.length, low = 0, probe;
        while (high - low > 1) {
            probe = (high + low) / 2;
            if (songs[probe].getTitle().equals(title)) {
                System.out.print(songs[probe]);
                return;
            }
            else if (songs[probe].getTitle().compareTo(title) > 0) {
                high = probe;
            }
            else {
                low = probe;
            }
        }
        System.out.println("Not found");
    }

    public static void findYear(M08_01_02Music[] songs, int year) {
        insertion(songs, 1);
        int high = songs.length, low = -1, probe;
        while (high - low > 1) {
            probe = (high + low) / 2;
            if (songs[probe].getYear() == year) {
                linearPrint(songs, probe, null, year, false);
                return;
            }
            else if (songs[probe].getYear() > year) {
                high = probe;
            }
            else {
                low = probe;
            }
        }
        System.out.println("Not found");
    }

    public static void findArtist(M08_01_02Music[] songs, String artist) {
        insertion(songs, 2);
        int high = songs.length, low = 0, probe;
        while (high - low > 1) {
            probe = (high + low) / 2;
            if (songs[probe].getArtist().equals(artist)) {
                linearPrint(songs, probe, artist, null, true);
                return;
            }
            else if (songs[probe].getArtist().compareTo(artist) > 0) {
                high = probe;
            }
            else {
                low = probe;
            }
        }
        System.out.println("Not found");
    }

    public static void linearPrint(M08_01_02Music[] songs, int probe, String artist, Integer year, boolean bool) {
        int i, start, end;
        i = start = end = probe;
        i--;
        // bool true -> print artist, false -> print year
        if (bool) {
            while (i >= 0 && songs[i].getArtist().equals(artist)) {
                start = i;
                i--;
            }
            i = probe + 1;
            while (i < songs.length && songs[i].getArtist().equals(artist)) {
                end = i;
                i++;
            }
            for (int j = start; j <= end; j++) {
                System.out.print(songs[j]);
            }
        }
        else {
            while (i >= 0 && songs[i].getYear() == year) {
                start = i;
                i--;
            }
            i = probe + 1;
            while (i < songs.length && songs[i].getYear() == year) {
                end = i;
                i++;
            }
            for (int j = start; j <= end; j++) {
                System.out.print(songs[j]);
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