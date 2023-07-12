package cf;
import java.util.*;
public class combine {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int rounds = input.nextInt();
        for (int i = 0; i < rounds; i++) {
            int numberOfWords = input.nextInt();
            input.nextLine();
            ArrayList<StringRep> words = new ArrayList<>();
            for (int j = 0; j < numberOfWords; j++) {
                String word = input.nextLine();
                int[] letters = new int[26];
                for (int k = 0; k < word.length(); k++) {
                    letters[word.charAt(k) - 'a'] = 1;
                }
                words.add(new StringRep(word, letters));
            }
            int maxCount = 0;
            String maxWords = "";
            for (int j = 0; j < words.size(); j++) {
                for (int k = j + 1; k < words.size(); k++) {
                    int sum = 0;
                    for (int l = 0; l < 26; l++) {
                        if (words.get(j).rep[l] == 1 || words.get(k).rep[l] == 1) {
                            sum++;
                        }
                    }
                    if (sum > maxCount) {
                        maxCount = sum;
                        maxWords = words.get(j).s + " " + words.get(k).s;
                    }
                }
            }
            System.out.println(maxWords);
        }
        input.close();
    }
}
class StringRep {
    String s;
    int[] rep;
    public StringRep(String s, int[] rep) {
        this.s = s;
        this.rep = rep;
    }
}