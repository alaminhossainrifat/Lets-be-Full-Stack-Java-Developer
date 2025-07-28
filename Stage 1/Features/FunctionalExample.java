import java.util.function.Function;

public class FunctionalExample {

    public static void main(String[] args) {
        Function <String, Integer> FindLength = str -> str.length();
        System.out.println(FindLength.apply("Bangladesh"));
    }
}


/*

✅ 1. What is a Functional Interface in Java?
Answer:
A Functional Interface is an interface that contains only one abstract method. It may have multiple default or static methods, but only one abstract method makes it a functional interface.

It enables the use of lambda expressions and method references.
Example:
    @FunctionalInterface
    interface Greeting {
        void sayHello();
    }


✅ 2. What is the purpose of the @FunctionalInterface annotation?
Answer:
The @FunctionalInterface annotation is used to indicate that an interface is meant to be a functional interface.
It helps the compiler enforce the rule of having only one abstract method. If more than one abstract method is present, it throws a compile-time error.


✅ 3. Can a Functional Interface have default and static methods?
Answer:
Yes, a functional interface can have any number of:
    - default methods
    - static methods
But it must have exactly one abstract method.
Example:
        @FunctionalInterface
        interface Calculator {
            int operate(int a, int b);

            default void show() {
                System.out.println("Default method");
            }

            static void info() {
                System.out.println("Static method");
            }
        }

✅ 4. Name some built-in functional interfaces in Java 8.
Answer:
Java provides several built-in functional interfaces in the java.util.function package:
| Interface           | Method Signature    | Use Case                  |
| ------------------- | ------------------- | ------------------------- |
| `Predicate<T>`      | `boolean test(T t)` | For conditional checks    |
| `Function<T,R>`     | `R apply(T t)`      | Converts T to R           |
| `Consumer<T>`       | `void accept(T t)`  | Performs action on T      |
| `Supplier<T>`       | `T get()`           | Supplies a value of T     |
| `BiFunction<T,U,R>` | `R apply(T t, U u)` | Takes 2 inputs, returns R |


✅ 5. How are functional interfaces used with lambda expressions?
Answer:
Lambda expressions are used to implement the abstract method of a functional interface without writing a full class.

Example:
    @FunctionalInterface
    interface MathOperation {
        int operate(int a, int b);
    }

    public class Test {
        public static void main(String[] args) {
            MathOperation add = (a, b) -> a + b;
            System.out.println(add.operate(5, 3)); // Output: 8
        }
    }

 */