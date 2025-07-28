import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap <Integer, String> employee = new HashMap<>();
        employee.put(101, "Rifat");
        employee.put(102, "Al Amin");
        employee.put(103, "Hossain");
        // employee.put(101, "Rifat");

        System.out.println(employee.get(101));
        System.out.println(employee.get(102));
        System.out.println(employee.get(103));
    }
}


/*

✅ 1. What is HashMap in Java and how does it work internally?
Answer:
HashMap is a part of Java's java.util package. It stores key-value pairs, and keys must be unique. It allows one null key and multiple null values.

Internal Working:

    - HashMap uses an array of buckets and each bucket uses a linked list (or a balanced tree for high collisions).
    - It uses the hashCode() method to find the index (bucket), and equals() to handle collisions.
    - Since Java 8, if the number of collisions in a bucket exceeds a threshold (default 8), the linked list is converted to a red-black tree for better performance.

✅ 2. What is the difference between HashMap, Hashtable, and ConcurrentHashMap?
| Feature         | HashMap        | Hashtable            | ConcurrentHashMap        |
| --------------- | -------------- | -------------------- | ------------------------ |
| Thread Safe     | ❌ No           | ✅ Yes (Synchronized) | ✅ Yes (High concurrency) |
| Performance     | High (no sync) | Slow                 | Better than Hashtable    |
| Allows Null Key | ✅ Yes (1 key)  | ❌ No                 | ❌ No                     |
| Introduced In   | JDK 1.2        | JDK 1.0              | JDK 1.5                  |

✅ 3. How does HashMap handle collisions?
Answer:
When two keys have the same hash code, HashMap places them in the same bucket (collision). Collisions are handled using:

    - Before Java 8: A linked list inside the bucket.
    - From Java 8 onward: If collisions exceed a threshold (TREEIFY_THRESHOLD = 8), the list is converted to a red-black tree.

✅ 4. Why are hashCode() and equals() important in HashMap?
Answer:
These two methods are essential for storing and retrieving keys properly in HashMap.
    - hashCode() determines the bucket index.
    - equals() checks if keys are logically equal, especially during collision resolution.

⚠️ If hashCode() and equals() are not overridden correctly in custom objects, duplicate keys may be stored or retrieval may fail.

✅ 5. What happens if you insert a duplicate key in HashMap?
Answer:
If I insert a duplicate key:
    - The old value is replaced with the new value.
    - No exception is thrown.


 */