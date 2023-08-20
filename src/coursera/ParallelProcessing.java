package coursera;
import java.util.*;
public class ParallelProcessing {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] task = new int[sc.nextInt()];
        for (int i = 0; i < task.length; i++) {
            task[i] = sc.nextInt();
        }

        if (task.length <= n) {
            for (int i = 0; i < task.length; i++) {
                System.out.println(i + " 0");
            }
        } else {
            PriorityQueue<Task> q = new PriorityQueue<>();
            Task[] ans = new Task[task.length];
            for (int i = 0; i < n; i++) {
                q.offer(new Task(task[i], i));
                ans[i] = new Task(i, 0);
                System.out.println(ans[i].time + " " + ans[i].threadName);
            }

            for (int i = n; i < task.length; i++) {
                Task tmp = q.poll();
                assert tmp != null;
                int threadName = tmp.threadName, time = tmp.time;
                ans[i] = new Task(threadName, time);
                q.offer(new Task(time + task[i], threadName));
                System.out.println(ans[i].time + " " + ans[i].threadName);
            }
        }
    }

    static class Task implements Comparable<Task> {
        final int time, threadName;

        public Task(int time, int threadName) {
            this.time = time;
            this.threadName = threadName;
        }

        public int compareTo(Task other) {
            return Integer.compare(time, other.time);
        }
    }
}