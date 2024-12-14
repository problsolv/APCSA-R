/**
 * @author Simon Chung
 * @version 10/01/2022
 * @purpose This program uses sequential and binary search to find a person's
 * name, relationship, birthday month, phone number, and email. It then outputs
 * the song's information if found and null if not found.
 * (Client class)
 */
public class M08_03ContactsTester {
    public static void insertion(M08_03Contacts[] contacts, boolean bool) {
        for (int i = 1; i < contacts.length; i++) {
            int j = i;
            // bool true -> sort by name, false -> sort by relation
            if (bool) {
                while ((j > 0) && (contacts[j].getName().charAt(0) < contacts[j - 1].getName().charAt(0))) {
                    M08_03Contacts temp = contacts[j - 1];
                    contacts[j - 1] = contacts[j];
                    contacts[j] = temp;
                    j--;
                }
            }
            else {
                while ((j > 0) && (contacts[j].getRelation().charAt(0) > contacts[j - 1].getRelation().charAt(0))) {
                    M08_03Contacts temp = contacts[j - 1];
                    contacts[j - 1] = contacts[j];
                    contacts[j] = temp;
                    j--;
                }
            }
        }
    }

    public static void findName(M08_03Contacts[] contacts, String name) {
        insertion(contacts, true);
        int high = contacts.length, low = -1, probe;
        while (high - low > 1) {
            probe = (high + low) / 2;
            if (contacts[probe].getName().equals(name)) {
                System.out.println(contacts[probe]);
                return;
            }
            else if (contacts[probe + 1].getName().equals(name)) {
                System.out.println(contacts[probe + 1]);
                return;
            }
            else if (contacts[probe].getName().compareTo(name) > 0) {
                high = probe;
            }
            else {
                low = probe;
            }
        }
        System.out.println("Not found");
    }

    public static void findRelation(M08_03Contacts[] contacts, String relation) {
        insertion(contacts, false);
        int high = contacts.length, low = -1, probe;
        while (high - low > 1) {
            probe = (high + low) / 2;
            if (contacts[probe].getRelation().equals(relation)) {
                linearPrintRelation(contacts, probe, relation);
                return;
            }
            else if (contacts[probe].getRelation().compareTo(relation) < 0) {
                high = probe;
            }
            else {
                low = probe;
            }
        }
        System.out.println("Not found");
    }

    public static void linearPrintRelation(M08_03Contacts[] contacts, int probe, String relation) {
        int i, start, end;
        i = start = end = probe;
        i -= 1;
        while (i >= 0 && contacts[i].getRelation().equals(relation)) {
            start = i;
            i--;
        }
        i = probe + 1;
        while (i < contacts.length && contacts[i].getRelation().equals(relation)) {
            end = i;
            i++;
        }
        for (int j = start; j <= end; j++) {
            System.out.print(contacts[j]);
        }
        System.out.println();
    }

    public static void findBirthday(M08_03Contacts[] contacts, String month) {
        StringBuilder list = new StringBuilder();
        for (M08_03Contacts contact : contacts) {
            if (contact.getBirthday().substring(0, 3).equals(month)) {
                list.append(contact);
            }
        }
        if (list.length() > 0) {
            System.out.println(list);
            return;
        }
        System.out.println("Not found");
    }

    public static void findPhone(M08_03Contacts[] contacts, String phone) {
        StringBuilder list = new StringBuilder();
        for (M08_03Contacts contact : contacts) {
            if (contact.getPhone().equals(phone)) {
                list.append(contact);
            }
        }
        if (list.length() > 0) {
            System.out.println(list);
            return;
        }
        System.out.println("Not found");
    }

    public static void findEmail(M08_03Contacts[] contacts, String email) {
        for (M08_03Contacts contact : contacts) {
            if (contact.getEmail().equals(email)) {
                System.out.println(contact);
                return;
            }
        }
        System.out.println("Not found");
    }

    public static void printResults(M08_03Contacts[] contacts) {
        System.out.printf("%-24s%-13s%-16s%-20s%12s%n", "Name", "Relation", "Birthday", "Phone Number", "Email");
        System.out.println("——————————————————————————————————————————————————————————————————————————————————————————————————————");
        for (M08_03Contacts contact : contacts) {
            System.out.print(contact);
        }
        System.out.println();
    }

    public static void main(String [ ] args) {
        String[] names = {"George Washington", "Martha Washington", "John Adams", "Abigail Adams",
                "Thomas Jefferson", "James Madison", "James Monroe", "Elizabeth Monroe", "John Quincy Adams", "Andrew Jackson"};
        String[] relations = {"Grandfather", "Grandfather", "Uncle", "Aunt", "Cousin", "Cousin",
                "Dad", "Mom", "Uncle", "Cousin"};
        String[] birthdays = {"Feb 22", "Jun 13", "Oct 19", "Nov 22", "Apr 2", "Mar 16", "Apr 28",
                "Jun 30", "Jul 11", "Mar 15"};
        String[] phones = {"407-405-3302", "407-554-1029", "321-094-1938", "321-094-1938", "689-204-2944",
                "407-923-3945", "321-103-2393", "689-102-2203", "689-667-2039", "407-203-0018"};
        String[] emails = {"gwashigton@gmail.com", "marthaw45@gmail.com", "jadams99@hotmail.com", "abiadams495@hotmail.com",
                "thomjeff4@gmail.com", "presidentmadison@outlook.com", "monroedoctrine@yahoo.com", "elizamonroe@gmail.com",
                "jqadams12@hotmail.com", "indianremoval1830@gmail.com"};
        M08_03Contacts[] contacts = new M08_03Contacts[names.length];
        for (int i = 0; i < contacts.length; i++) {
            contacts[i] = new M08_03Contacts(names[i], relations[i], birthdays[i], phones[i], emails[i]);
        }
        System.out.println("Original Contacts List:");
        printResults(contacts);

        System.out.println("<< Search for George Washington >>");
        findName(contacts, "George Washington");

        System.out.println("<< Search for uncles >>");
        findRelation(contacts, "Uncle");

        System.out.println("<< Search for birthdays in June >>");
        findBirthday(contacts, "Jun");

        System.out.println("<< Search for the phone number 321-094-1938 >>");
        findPhone(contacts, "321-094-1938");

        System.out.println("<< Search for indianremoval1830@gmail.com >>");
        findEmail(contacts, "indianremoval1830@gmail.com");
    }
}