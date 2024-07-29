package cf;
import java.util.Scanner;
import java.io.PrintWriter;
public class CFBachgold {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = sc.nextInt();
        if(n % 2 == 0) {
            pw.println(n / 2);
            for (int i = 0; i < n / 2; i++) {
                pw.print(2 + " ");
            }
        }
        else {
            pw.println(n / 2);
            for (int i = 0; i < n / 2 - 1; i++) {
                pw.print(2 + " ");
            }
            pw.println(3);
        }
        pw.close();
    }
}