package problems;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.*;
public class Reserves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n --> 0) {
            String s = sc.next();
            int d = sc.nextInt();
            LocalDate startDate = LocalDate.of(2048, 6, 1), futureDate = startDate.plusDays(d);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
            System.out.println(futureDate.format(formatter));

        }
    }
}