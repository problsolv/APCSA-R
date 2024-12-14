package problems;
import java.io.*;
import java.util.*;
public class cowqueue {
    static class Cow implements Comparator<Cow> {
        int arrive, time;
        Cow(int arrive, int time) {
            this.arrive = arrive;
            this.time = time;
        }

        @Override
        public int compare(Cow o1, Cow o2) {
            return o1.arrive - o2.arrive;
        }
    }


    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(new File("cowqueue.in"));
        //PrintWriter pw = new PrintWriter("cowqueue.out");
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        Cow[] cows = new Cow[n];
        for (int i = 0; i < n; i++) {
            cows[i] = new Cow(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(cows, new Cow(0, 0));
        int time = 0;
        for (int i = 0; i < n; i++) {
            if (time <= cows[i].arrive) time = cows[i].arrive + cows[i].time;
            else time += cows[i].time;
        }
        pw.println(time);
        sc.close();
        pw.close();
    }
}