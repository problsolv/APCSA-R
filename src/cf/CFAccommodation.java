package cf;
import java.util.Scanner;
public class CFAccommodation {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int[][] rooms = new int[sc.nextInt()][2];
        for (int i = 0; i < rooms.length; i++) for (int j = 0; j < rooms[0].length; j++) rooms[i][j] = sc.nextInt();
        int c = 0;
        for (int[] arr : rooms) if (arr[1] - arr[0] >= 2) c++;
        System.out.println(c);
    }
}