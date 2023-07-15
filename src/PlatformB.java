import java.util.*;
/**
 * TESTING PLATFORM B
 */
public class PlatformB {
    static void assignJobs(int numWorkers, int[] jobs) {
        // TODO: replace this code with a faster algorithm.
        int[] assignedWorker = new int[jobs.length];
        long[] startTime = new long[jobs.length];
        long[] nextFreeTime = new long[numWorkers];
        for (int i = 0; i < jobs.length; i++) {
            int duration = jobs[i];
            int bestWorker = 0;
            for (int j = 0; j < numWorkers; ++j) {
                if (nextFreeTime[j] < nextFreeTime[bestWorker])
                    bestWorker = j;
            }
            assignedWorker[i] = bestWorker;
            startTime[i] = nextFreeTime[bestWorker];
            nextFreeTime[bestWorker] += duration;
            System.out.println(assignedWorker[i] + " " + startTime[i]);
        }
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] jobs = new int[sc.nextInt()];
        for (int i = 0; i < jobs.length; i++) jobs[i] = sc.nextInt();
        assignJobs(a, jobs);
    }
}