/**
 * @author Simon Chung
 * @version 09/06/2022
 * @purpose This program uses insertion sort to sort movies based on their name, year produced, and production company.
 * (Client class)
 */
public class M07_09MovieTesterV1 {
    public static void sortName(M07_09_10Movie[] movies, boolean bool) {
        for (int i = 1; i < movies.length; i++) {
            int j = i;
            // bool true -> return ascending array, false -> return descending array
            if (bool) {
                while ((j > 0) && (movies[j].getTitle().charAt(0) < movies[j - 1].getTitle().charAt(0))) {
                    M07_09_10Movie temp = movies[j - 1];
                    movies[j - 1] = movies[j];
                    movies[j] = temp;
                    j--;
                }
            }
            else {
                while ((j > 0) && (movies[j].getTitle().charAt(0) > movies[j - 1].getTitle().charAt(0))) {
                    M07_09_10Movie temp = movies[j - 1];
                    movies[j - 1] = movies[j];
                    movies[j] = temp;
                    j--;
                }
            }
        }
        printResults(movies);
    }

    public static void sortYear(M07_09_10Movie[] movies, boolean bool) {
        for (int i = 1; i < movies.length; i++) {
            int j = i;
            // bool true -> return ascending array, false -> return descending array
            if (bool) {
                while ((j > 0) && (movies[j].getYear() < movies[j - 1].getYear())) {
                    M07_09_10Movie temp = movies[j - 1];
                    movies[j - 1] = movies[j];
                    movies[j] = temp;
                    j--;
                }
            }
            else {
                while ((j > 0) && (movies[j].getYear() > movies[j - 1].getYear())) {
                    M07_09_10Movie temp = movies[j - 1];
                    movies[j - 1] = movies[j];
                    movies[j] = temp;
                    j--;
                }
            }
        }
        printResults(movies);
    }

    public static void sortStudio(M07_09_10Movie[] movies, boolean bool) {
        for (int i = 1; i < movies.length; i++) {
            int j = i;
            // bool true -> return ascending array, false -> return descending array
            if (bool) {
                while ((j > 0) && (movies[j].getStudio().charAt(0) < movies[j - 1].getStudio().charAt(0))) {
                    M07_09_10Movie temp = movies[j - 1];
                    movies[j - 1] = movies[j];
                    movies[j] = temp;
                    j--;
                }
            }
            else {
                while ((j > 0) && (movies[j].getStudio().charAt(0) > movies[j - 1].getStudio().charAt(0))) {
                    M07_09_10Movie temp = movies[j - 1];
                    movies[j - 1] = movies[j];
                    movies[j] = temp;
                    j--;
                }
            }
        }
        printResults(movies);
    }

    public static void printResults(M07_09_10Movie[] movies) {
        System.out.printf("%-30s%5s   %s%n", "Title", "Year", "Studio");
        System.out.println("——————————————————————————————————————————————————————————");
        for (M07_09_10Movie movie : movies) {
            System.out.print(movie.toString());
        }
        System.out.println();
    }

    public static void main(String [ ] args) {
        String[] titles = {"Braveheart", "Conviction", "No Way Home", "Animal Farm",
                "HP & the Deathly Hallows pt 1", "The Zookeeper's Wife", "Frozen 2"};
        int[] years = {1995, 2010, 2021, 1999, 2010, 2017, 2019};
        String[] studios = {"Icon Productions", "20th Century Fox", "Marvel Studios",
                "Sonar Entertainment", "Warner Bros.", "LD Entertainment", "Disney"};
        M07_09_10Movie[] movies = new M07_09_10Movie[titles.length];
        for (int i = 0; i < movies.length; i++) {
            movies[i] = new M07_09_10Movie(titles[i], years[i], studios[i]);
        }

        System.out.println("Original Movie List:");
        printResults(movies);

        System.out.println("<< Sort in ascending order by title >>");
        sortName(movies, true);

        System.out.println("<< Sort in descending order by title >>");
        sortName(movies, false);

        System.out.println("<< Sort in ascending order by year >>");
        sortYear(movies, true);

        System.out.println("<< Sort in descending order by year >>");
        sortYear(movies, false);

        System.out.println("<< Sort in ascending order by studio >>");
        sortStudio(movies, true);

        System.out.println("<< Sort in descending order by studio >>");
        sortStudio(movies, false);
    }
}