package problems;

import java.util.*;

public class Tagged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n --> 0) {
            int l = sc.nextInt();
            ArrayList<Integer[]> GRID = new ArrayList<>();
            String[][] st = new String[l][l];
            for (int i = 0; i < l; i++) {
                String x = sc.next();
                if (!x.replace("*", "").isEmpty()) {
                    GRID.add(new Integer[]{i, x.indexOf("$")});
                }
                st[i] = x.split("");
            }
            for (Integer[] ar : GRID) {
                int x = ar[0];
                int y = ar[1];
                int[] dx = {0, 0, 1, -1};
                int[] dy = {1, -1, 0, 0};
                for (int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    for (int j = 0; j < 4; j++) {
                        int ny = y + dy[j];
                        if (nx >= 0 && nx < l && ny >= 0 && ny < l && st[nx][ny].equals("*")) {
                            st[nx][ny] = "#";
                        }
                    }
                }
            }
            for (String[] ar : st) {
                System.out.println(String.join("", ar));
            }
            System.out.println();
        }
    }
}
