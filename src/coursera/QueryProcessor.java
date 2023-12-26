package coursera;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QueryProcessor {
    private final int bucket_count;
    private final List<String>[] buckets;

    public QueryProcessor(int bucket_count) {
        this.bucket_count = bucket_count;
        buckets = new ArrayList[bucket_count];
        for (int i = 0; i < bucket_count; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    private int hash(String str) {
        long ans = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            ans = (ans * 263 + str.charAt(i)) % 1000000007;
        }
        return (int) (ans % bucket_count);
    }

    public void add(String str) {
        int hashed = hash(str);
        List<String> bucket = buckets[hashed];
        if (!bucket.contains(str)) {
            bucket.add(0, str);
        }
    }

    public void delete(String str) {
        int hashed = hash(str);
        List<String> bucket = buckets[hashed];
        for (int i = 0; i < bucket.size(); i++) {
            if (bucket.get(i).equals(str)) {
                bucket.remove(i);
                break;
            }
        }
    }

    public String find(String str) {
        return buckets[hash(str)].contains(str) ? "yes" : "no";
    }

    public List<String> check(int i) {
        return buckets[i];
    }

    public static void main(String [ ] args) {
        Scanner sc = new Scanner(System.in);
        QueryProcessor qp = new QueryProcessor(sc.nextInt());
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String f = sc.next(), t = sc.next();
            switch (f) {
                case "add":
                    qp.add(t);
                    break;
                case "del":
                    qp.delete(t);
                    break;
                case "find":
                    System.out.println(qp.find(t));
                    break;
                case "check":
                    int index = Integer.parseInt(t);
                    List<String> result = qp.check(index);
                    System.out.println(String.join(" ", result));
                    break;
            }
        }
        sc.close();
    }
}