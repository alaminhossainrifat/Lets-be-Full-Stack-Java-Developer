class box <T> {

    private T value;

    public void setValue (T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }
    
}
public class Main {

    public static void main(String[] args) {
        box<String> stringBox = new box<>();
        stringBox.setValue("Rifat");
        System.out.println("String Box: "+stringBox.getValue());

        box<Integer> intBox = new box<>();
        intBox.setValue(2003);
        System.out.println("Integer Box: "+intBox.getValue());
    }
}

/*
 
✅ 1. What are Generics in Java? Why are they used?
Answer:
Generics are a feature that allows parameterized types, so you can write a single class, interface, or method that works with any data type.

Why used:

    - Ensures compile-time type safety
    - Avoids casting
    - Makes code reusable and clean

✅ 2. What is the difference between <T>, <E>, <K, V> in generics?
Answer:
These are type parameters used for readability:

    - <T> → Type (e.g., class type)
    - <E> → Element (used in collections like List<E>)
    - <K, V> → Key and Value (used in maps like Map<K, V>)

They all work the same but are named by convention based on usage.

✅ 3. What are bounded type parameters in Generics?
Answer:
Bounded types restrict the types you can pass as generic arguments.
        class MyClass<T extends Number> { }
    This means T can only be Number or its subclass (Integer, Double, etc.).

✅ 4. Can you use primitive types like int with Generics? Why not?
Answer:
No, Java does not allow primitive types (int, char, etc.) directly in generics.
Because generics work with objects only, use wrapper classes like Integer, Double, Character, etc. instead.


✅ 5. What is Type Erasure in Java Generics?
Answer:
At runtime, Java removes all generic type information — this is called type erasure.

Example:
        List<String> list = new ArrayList<>();

At runtime, it's treated as just a List (no <String>).
This allows backward compatibility with older versions of Java.



 */