/**
 * @author Simon Chung
 * @version 10/01/2022
 * @purpose This program uses sequential and binary search to find a person's
 * name, relationship, birthday month, phone number, and email. It then outputs
 * the song's information if found and null if not found.
 * (Implementation class)
 */
public class M08_03Contacts {
    private final String name, relation, birthday, phone, email;

    public M08_03Contacts(String name, String relation, String birthday, String phone, String email) {
        this.name = name;
        this.relation = relation;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getRelation() {
        return relation;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return String.format("%-23s%-15s%-15s%-20s%s%n", getName(), getRelation(), getBirthday(), getPhone(), getEmail());
    }
}
