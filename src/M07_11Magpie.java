/**
 * @author Simon Chung
 * @version 09/18/22
 * @purpose A program to carry on conversations with a human user.
 * This version:
 *      - Uses advanced search for keywords
 *      - Will transform statements as well as react to keywords

 * Code adapted from work by Laurie White for the College Board.
 * (Implementation Class)
 */
public class M07_11Magpie {
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    public String getResponse(String statement) {
        statement = statement.trim();
        String response;
        if (statement.isEmpty()) {
            response = "Say something, please.";
        }
        else if (findKeyword(statement, "no") >= 0) {
            response = "Why so negative?";
        }
        else if (findKeyword(statement, "mother") >= 0 || findKeyword(statement, "father") >= 0
                || findKeyword(statement, "sister") >= 0 || findKeyword(statement, "brother") >= 0
                || findKeyword(statement, "cousin") >= 0
                || findKeyword(statement, "sibling") >= 0
                || findKeyword(statement, "parent") >= 0) {
            response = "Tell me more about your family.";
        }
        else if (findKeyword(statement, "I want to", 0) >= 0) {
            response = transformIWantToStatement(statement);
        }
        else if (findKeyword(statement, "I want", 0) >=0) {
            response = transformIWantStatement(statement);
        }
        else {
            int positionYou = findKeyword(statement, "you", 0);
            int positionI = findKeyword(statement, "I", 0);

            if (positionYou >= 0 && findKeyword(statement, "me", positionYou) >= 0) {
                response = transformYouMeStatement(statement);
            }
            else if (positionYou >= 0 && positionI < positionYou) {
                response = transformIYouStatement(statement);
            }
            else {
                response = getRandomResponse();
            }
        }
        return response;
    }

    /**
     * Take a statement with "I want to <something>." and transform it into
     * "What would it mean to <something>?"
     * @param statement: the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    public String transformIWantToStatement(String statement) {
        statement = statement.trim();
        String last = statement.substring(statement.length() - 1);

        if (last.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }
        int position = findKeyword (statement, "I want to", 0);
        String remaining = statement.substring(position + 9).trim();
        return "What would it mean to " + remaining + "?";
    }

    /**
     * Take a statement with "I want <something>" and transform it into
     * "Would you be really happy if you had <something>?"
     * @param statement: the user statement, assumed to contain "I want"
     * @return the transformed statement
     */
    public String transformIWantStatement(String statement) {
        statement = statement.trim();
        String last = statement.substring(statement.length() - 1);

        if (last.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }
        int position = findKeyword (statement, "I want", 0);
        String remaining = statement.substring(position + 6).trim();
        return "Would you be really happy if you had " + remaining + "?";
    }

    /**
     * Take a statement with "you <something> me" and transform it into
     * "What makes you think that I <something> you?"
     * @param statement: the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    public String transformYouMeStatement(String statement) {
        statement = statement.trim();
        String last = statement.substring(statement.length() - 1);

        if (last.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }

        int You = findKeyword (statement, "you", 0);
        int Me = findKeyword (statement, "me", You + 3);

        String remaining = statement.substring(You + 3, Me).trim();
        return "What makes you think that I " + remaining + " you?";
    }

    /**
     * Take a statement with "I <something> you" and transform it into
     * "What makes you think that I <something> you?"
     * @param statement: the user statement, assumed to contain "I" followed by "you"
     * @return the transformed statement
     */
    public String transformIYouStatement(String statement) {
        statement = statement.trim();
        String last = statement.substring(statement.length() - 1);

        if (last.equals(".")) {
            statement = statement.substring(0, statement.length() - 1);
        }

        int I = findKeyword (statement, "me", 0);
        int You = findKeyword (statement, "you", I + 3);
        String remaining = statement.substring(I + 3, You).trim();
        return "Why do you " + remaining + " me?";
    }

    /**
     * Search for one word in phrase.  The search is not case-sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").
     * @param statement: the string to search
     * @param goal: the string to search for
     * @param startPos: the character of the string to begin the search at
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    public int findKeyword(String statement, String goal, int startPos) {
        statement = statement.trim();
        int position = statement.toLowerCase().indexOf(goal.toLowerCase(), startPos);
        while (position >= 0) {
            String before = " ", after = " ";
            if (position > 0) {
                before = statement.substring(position - 1, position).toLowerCase();
            }
            if (position + goal.length() < statement.length()) {
                after = statement.substring(position + goal.length(), position + goal.length() + 1).toLowerCase();
            }
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0))
                    && ((after.compareTo("a") < 0) || (after.compareTo("z") > 0))) {
                return position;
            }
            position = statement.indexOf(goal.toLowerCase(), position + 1);
        }
        return -1;
    }

    /**
     * Search for one word in phrase.  The search is not case-sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.
     * @param statement: the string to search
     * @param goal: the string to search for
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    public int findKeyword(String statement, String goal) {
        return findKeyword(statement, goal, 0);
    }

    public String getRandomResponse() {
        String[] randomResponses = {"Interesting, tell me more.",
                "Hmm.", "Do you really think so?", "You don't say.",
                "Good to know.", "That seems cool."};
        return randomResponses[(int)(Math.random() * randomResponses.length)];
    }
}