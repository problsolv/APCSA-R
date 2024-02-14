import java.util.Scanner;
import java.io.File;
import java.io.IOException;
/**
 * @author Simon Chung
 * @version 06/17/2022
 * @purpose This program calculates the probability that a family with 2
 * children will have either the same or different gender.
 * Download the familyMembers.txt file from FLVS and change the file name to family.txt.
 */
public class M04_03FamilyStructure {
    public static void main(String [ ] args) throws IOException {
        File family = new File("/Users/simon/Library/CloudStorage/OneDrive-PlanoISD/9/APCSA/APCSA/family.txt");
        Scanner infile = new Scanner(family);
        int BB, BG, GG, families;
        BB = BG = GG = families = 0;
        System.out.println("Composition statistics for families with 2 children.\n");
        while (infile.hasNext()) {
            String token = infile.next();
            if (token.equals("BB")) BB++;
            else if (token.equals("GG")) GG++;
            else BG++;
            families++;
        }
        System.out.println("Total number of families: " + families);
        System.out.println("\nNumber of families with");
        System.out.println("\t\t  2 boys: " + BB + " represents " + (BB * 100 / families) + "%");
        System.out.println("\t\t 2 girls: " + GG + " represents " + (GG * 100 / families) + "%");
        System.out.println("1 boy and 1 girl: " + BG + " represents " + (BG * 100 / families) + "%");
        infile.close();
    }
}