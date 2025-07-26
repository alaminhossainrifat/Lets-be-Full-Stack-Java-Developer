import java.util.*;
public class Array_List {

    public static void main(String[] args) {
        List <String> names = new ArrayList<>(); //declare ArrayList
        names.add("Rifat");
        names.add("Al Amin");
        names.add("Hossain");
        names.add("Rifat"); //Allowed Duplicate
        names.add(4,"Muhammad"); // add specific index

        System.out.println(names);
        System.out.println("2nd name: "+names.get(1));
    }
}

/*
    ❓Q1: What is List in Java?
✅ A: List is an ordered collection in Java that allows duplicate elements. You can access elements by index.
    ❓Q2: What's the difference between ArrayList and LinkedList?
| Feature       | ArrayList                | LinkedList                 |
| ------------- | ------------------------ | -------------------------- |
| Storage       | Dynamic array            | Doubly linked list         |
| Access        | Fast (random access)     | Slower (sequential)        |
| Insert/Delete | Slow (shifting required) | Fast (pointer adjustments) |
| Memory usage  | Less                     | More                       |
 */