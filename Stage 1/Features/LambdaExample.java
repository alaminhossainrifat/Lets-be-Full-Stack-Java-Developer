interface sayHello{
    void say();
}


public class LambdaExample {

    public static void main(String[] args) {
        sayHello hello = () -> System.out.println("Hello Rifat");
        hello.say();
    }
}

/*

✅ 1. What is a Lambda Expression in Java?
Answer:
A Lambda Expression is a short block of code that takes in parameters and returns a value. It is used primarily to implement functional interfaces (interfaces with only one abstract method).

Syntax:
(parameter) -> expression


✅ 2. What are the key components of a Lambda Expression?
Answer:
A Lambda expression has three main parts:
    (parameters) -> { body }
        - Parameters: Can be empty (), single x, or multiple (x, y)
        - Arrow token: -> separates parameters and body
        - Body: A single expression or a block { }


✅ 3. What is a Functional Interface, and how does it relate to Lambda?
Answer:
A Functional Interface is an interface with only one abstract method. It can have multiple default or static methods.

Lambda expressions can be used only with functional interfaces.

Example:
        @FunctionalInterface
        interface MathOperation {
            int operate(int a, int b);
        }

        MathOperation add = (a, b) -> a + b;
        System.out.println(add.operate(5, 3)); // Output: 8


✅ 4. What are the advantages of using Lambda Expressions?
Answer:
    ✅ Concise Code – Less boilerplate
    ✅ Improved Readability – More expressive
    ✅ Enable Functional Programming
    ✅ Used with Stream API for easy data manipulation
    ✅ Supports Parallelism with cleaner syntax

✅ 5. Can Lambda Expressions access variables from the enclosing scope?
Answer:
Yes, Lambda expressions can access local variables from the enclosing method only if they are effectively final (not modified after assignment).
Example: 
    String greeting = "Hello";

    Runnable r = () -> System.out.println(greeting); // OK if 'greeting' is not changed later
    r.run(); // Output: Hello

 */