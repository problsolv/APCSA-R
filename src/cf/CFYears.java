package cf;
import java.util.Scanner;
public class CFYears {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        boolean bool = false;
        while (!bool) {
            y++;
            String yr = String.valueOf(y);
            String[] yrs = new String[]{yr.substring(0, 1), yr.substring(1, 2), yr.substring(2, 3), yr.substring(3)};
            if (!yrs[0].equals(yrs[1]) && !yrs[0].equals(yrs[2]) && !yrs[0].equals(yrs[3]) && !yrs[1].equals(yrs[2]) && !yrs[1].equals(yrs[3]) && !yrs[2].equals(yrs[3]))
                bool = true;
        }
        System.out.println(y);
    }
}