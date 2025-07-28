import java.util.List;

public class StreamsExample {

    public static void main(String[] args) {
        List <String> names = List.of("Al Amin", "Hossain", "Rifat");

        names.stream()
            .filter(name -> name.startsWith("R"))
            .forEach(System.out::println);
    }
}

/* 

✅ 1. What is the Java Stream API and why is it used?
Answer:
The Stream API in Java is used to process collections of objects in a functional and declarative style. It allows operations such as filtering, mapping, sorting, and reducing data in a pipeline-like fashion.

✅ Why use it?
    - Improves code readability and conciseness
    - Supports lazy evaluation
    - Enables parallel processing with .parallelStream()


✅ 2. What is the difference between Collection and Stream in Java?
Answer:
| Feature        | Collection                | Stream                         |
| -------------- | ------------------------- | ------------------------------ |
| Stores Data    | Yes                       | No (used to process data only) |
| Iteration Type | External (e.g., for-loop) | Internal (handled by Stream)   |
| Reusable       | Yes                       | No (can only be consumed once) |
| Operations     | CRUD operations           | Functional-style operations    |


✅ 3. What are intermediate and terminal operations in Stream API?
Answer:
Intermediate Operations: Return another Stream, allowing method chaining. Examples:
    - filter()
    - map()
    - sorted()
    - distinct()
Terminal Operations: Trigger the execution of the stream pipeline and return a non-stream result. Examples:
    - collect()
    - forEach()
    - count()
    - reduce()
Example:
    import java.util.*;
    import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = List.of("Rifat", "Hossain", "Al AMin", "Java", "Python");

        List<String> result = names.stream()                         // Source
            .filter(n -> n.startsWith("A"))                          // Intermediate: filter
            .map(String::toUpperCase)                                // Intermediate: map
            .distinct()                                              // Intermediate: distinct
            .sorted()                                                // Intermediate: sorted
            .collect(Collectors.toList());                           // Terminal: collect

        System.out.println(result); // Output: [AL AMIN]
    }
}



✅ 4. What is the difference between map() and flatMap()?
Answer:
| Method      | Description                                                             |
| ----------- | ----------------------------------------------------------------------- |
| `map()`     | Transforms each element and returns a **stream of transformed values**. |
| `flatMap()` | Flattens nested structures, returning a **single combined stream**.     |


✅ 5. What is the difference between Stream() and parallelStream()?
Answer:
| Feature     | `stream()`                 | `parallelStream()`                |
| ----------- | -------------------------- | --------------------------------- |
| Execution   | Sequential (single thread) | Parallel (multi-threaded)         |
| Performance | Slower for large data      | Faster (with multicore CPU)       |
| Use Case    | Small to medium tasks      | Large collections & CPU-intensive |







*/