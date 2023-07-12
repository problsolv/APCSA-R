package cf;
import java.util.*;
public class CFRegistration {
    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> dataBase = new HashMap<>();
        int testCases = sc.nextInt();
        for(int i = 0; i < testCases; i++){
            String input = sc.next();
            if(dataBase.containsKey(input)){
                int x = dataBase.get(input);
                x++;
                dataBase.put(input, x);
                System.out.println(input+x);
            }
            else{
                System.out.println("OK");
                dataBase.put(input, 0);
            }
        }
    }
}