/**
 * @author Simon Chung
 * @version 08/08/2022
 * @purpose A program to allow students to try out different
 * String methods.
 * Code adapted from work by Laurie White for the College Board.
 */
public class M06_05StringExplorer {
    public static void main(String [ ] args) {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);
        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "    Simon is the best    ";
        String trim = sample.trim();

        System.out.println("sample = " + sample);
        System.out.println("sample.trim() = " + trim);
        System.out.println("sample.compareTo(sample.trim()) = " + sample.compareTo(trim));
        System.out.println("sample.length() = " + sample.length());
        System.out.println("sample.trim().length() = " + trim.length());
        String newsample = sample.substring(0, sample.indexOf("S")) + trim + sample.substring(trim.length() + 4);
        System.out.println("Sample equal to itself:" + newsample);
        System.out.println("sample.indexOf(\"the\") = " + sample.indexOf("the"));
        System.out.println("trim.indexOf(\"the\") = " + trim.indexOf("the"));
        System.out.println("sample.indexOf(\"is\", trim.indexOf(\"is\")) = " + sample.indexOf("is", trim.indexOf("is")));
    }
}