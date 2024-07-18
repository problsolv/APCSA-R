import java.io.*;
import java.util.*;
public class cowqueue {
    static class Pair implements Comparator<Pair> {
        int arrive, time;
        Pair(int arrive, int time) {
            this.arrive = arrive;
            this.time = time;
        }

        @Override
        public int compare(Pair o1, Pair o2) {
            return o1.arrive - o2.arrive;
        }
    }


    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(new File("cowqueue.in"));
        //PrintWriter pw = new PrintWriter("cowqueue.out");
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        Pair[] cows = new Pair[n];
        for (int i = 0; i < n; i++) {
            cows[i] = new Pair(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(cows, new Pair(0, 0));
        int time = 0;
        for (int i = 0; i < n; i++) {
            if (time <= cows[i].arrive) {
                time = cows[i].arrive + cows[i].time;
            }
            else time += cows[i].time;
        }
        pw.println(time);
        sc.close();
        pw.close();
    }
}