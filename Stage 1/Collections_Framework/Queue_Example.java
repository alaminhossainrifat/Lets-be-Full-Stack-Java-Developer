import java.util.LinkedList;
import java.util.Queue;

public class Queue_Example {

    public static void main(String[] args) {
        Queue <String> names = new LinkedList<>();
        names.add("Rifat");
        names.add("Hossain");
        names.add("Al Amin");
        names.add("Java");

        System.out.println("Before Remove: "+names);

        names.remove(); //FIFO
        System.out.println("After Remove: "+names);
    }
}


/*
 
✅ 1. What is a Queue in Java and how is it implemented?
Answer:
A Queue is a First-In-First-Out (FIFO) data structure — the element added first is removed first.

In Java, Queue is an interface in the java.util package, and it is implemented by classes like:
    - LinkedList (most common)
    - PriorityQueue (for sorted elements)
    - ArrayDeque (for double-ended queue)
    - ConcurrentLinkedQueue (for thread-safe operations)

✅ 2. What is the difference between Queue.add() and Queue.offer()?
Answer:
| Method    | Behavior when queue is full                   |
| --------- | --------------------------------------------- |
| `add()`   | Throws an `IllegalStateException`             |
| `offer()` | Returns `false` instead of throwing exception |

✅ 3. What are the main methods provided by the Queue interface?
Answer:
The Queue interface provides the following key methods:
    - add(E e) – Inserts element (throws exception if fails)
    - offer(E e) – Inserts element (returns false if fails)
    - remove() – Removes and returns head (throws exception if empty)
    - poll() – Removes and returns head (returns null if empty)
    - element() – Returns head without removing (throws exception if empty)
    - peek() – Returns head without removing (returns null if empty)

✅ 4. How does a PriorityQueue differ from a regular Queue?
Answer:
PriorityQueue does not follow strict FIFO order. Instead, it orders elements based on natural ordering or a custom Comparator.
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println(pq.poll()); // Outputs: 10 (smallest first)

 
 */