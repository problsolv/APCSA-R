package problems;
import java.util.*;
public class PhoneBook {
    private final Scanner in = new Scanner(System.in);
    // Keep list of all existing (i.e. not deleted yet) contacts.
    private final List<Contact>[] hashtable;
    private final int m = 101;
    private int a = -1, b = -1;

    private static final Random random = new Random();

    // Store outputs of naive/fast results
    private static List<String> resFast;

    @SuppressWarnings("unchecked")
    public PhoneBook () {
        // Implementation of separate chaining
        // BZ:
        hashtable = new List[m];
        for (int i = 0; i < m; i++) {
            hashtable[i] = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        new PhoneBook().processQueries();
    }

    private Query readQuery() {
        String type = in.next();
        int number = in.nextInt();
        if (type.equals("add")) {
            String name = in.next();
            return new Query(type, name, number);
        } else {
            return new Query(type, number);
        }
    }

    private void writeResponse(String response) {
        System.out.println(response);
    }

    public void processQuery(Query query) {
        if (query.type.equals("add")) {
            insert(query);
        }
        else if (query.type.equals("del")) {
            remove(query);
        }
        else {
            String response = search(query);
            writeResponse(response);
            if (resFast != null) resFast.add(response);
        }
    }


    private void insert(Query query) {
        int index = hash(query.number);
        for (Contact contact : hashtable[index]) {
            if (contact.number == query.number) {
                contact.name = query.name;
                return;
            }
        }
        hashtable[index].add(new Contact(query.name, query.number));
    }


    private void remove(Query query) {
        int index = hash(query.number);
        Iterator<Contact> iter = hashtable[index].iterator();
        while (iter.hasNext()) {
            Contact contact = iter.next();
            if (contact.number == query.number) {
                iter.remove();
                return;
            }
        }
    }


    private String search(Query query) {
        int index = hash(query.number);
        for (Contact contact : hashtable[index]) {
            if (contact.number == query.number) {
                return contact.name;
            }
        }
        return "not found";
    }


    private int hash(int number) {
        int p = nextPrime();
        int bound = p - 1;
        if (a == -1) a = (random.nextInt(bound) + 1) % p;
        if (b == -1) b = (random.nextInt(bound + 1)) % p;
        int hashval = (((a * (number % p)) % p + (b % p)) % p) % m;
        if (hashval < 0) hashval += m;
        return hashval;
    }


    private int nextPrime() {
        int n = 10000001;
        while (!isPrime(n)) n += 2;
        return n;
    }
    private static boolean isPrime( int n ){
        if(n % 2 == 0) return false;
        for( int i = 3; i * i <= n; i += 2 )
            if( n % i == 0 ) return false;
        return true;
    }

    public void processQueries() {
        int queryCount = in.nextInt();
        for (int i = 0; i < queryCount; ++i)
            processQuery(readQuery());
    }

    static class Contact {
        String name;
        int number;

        public Contact(String name, int number) {
            this.name = name;
            this.number = number;
        }
    }

    static class Query {
        String type;
        String name;
        int number;

        public Query(String type, String name, int number) {
            this.type = type;
            this.name = name;
            this.number = number;
        }

        public Query(String type, int number) {
            this.type = type;
            this.number = number;
        }
    }
}