import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Apple"); //Duplicate ignore

        System.out.println("Fruits Names: "+fruits);
    }
}

/*
✅ 1. What is HashSet in Java and how does it work?
Answer:
HashSet is a class in Java that implements the Set interface and uses a hash table for storage. It does not allow duplicate elements and permits null values (only one). Internally, it uses a HashMap to store the elements.
The elements are unordered (no insertion order).
The time complexity for add, remove, and contains operations is O(1) on average.

✅ 2. How does HashSet handle duplicate elements?
Answer:
HashSet uses the hashCode() and equals() methods to determine duplicates. If two elements have the same hash code and are considered equal via equals(), the duplicate is not added.
Custom objects should override hashCode() and equals() properly.

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }

        @Override
        public boolean equals(Object obj) {
            // logic to compare fields
        }

❓Q3: Difference between HashSet, LinkedHashSet, and TreeSet?
| Type          | Order Maintained   | Allows Null  | Sorted  |
| ------------- | -----------------  | -----------  | ------  |
| HashSet       | ❌ No              | ✅ Yes       | ❌ No   |
| LinkedHashSet | ✅ Insertion order | ✅ Yes       | ❌ No   |
| TreeSet       | ✅ Sorted order    | ❌ No        | ✅ Yes  |

✅ 4. Can we store null elements in a HashSet?
Answer:
Yes, a HashSet can store one null element. If you try to add more than one, the duplicates will be ignored.

✅ 5. How is HashSet internally implemented in Java?
Answer:
Internally, HashSet uses a HashMap. Each element you add to the HashSet is stored as a key in the internal HashMap, with a constant dummy value (like PRESENT).

        private transient HashMap<E,Object> map;
        private static final Object PRESENT = new Object();

        public boolean add(E e) {
            return map.put(e, PRESENT)==null;
        }


 */