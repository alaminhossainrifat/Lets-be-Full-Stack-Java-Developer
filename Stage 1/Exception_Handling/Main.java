/*  The exception Handling is one of the powerfull machanism to handle the runtime errors.
Keywords: 
    - try
    - catch - finally
    - throw - throws
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.print("Enter First Number: ");
        x = sc.nextInt();
        System.out.print("Enter Second Number: ");
        y = sc.nextInt();
        try {
            int result = x / y;
            System.out.println("Results: "+result);
            sc.close();
        } catch (Exception e) {
            System.out.println("Can not divided by zero!!");
        }
        finally{
            System.out.println("Program continues...");
        }
    }
}

/* 
🔝 Top 5 Interview Questions on Exception Handling
✅ 1. What is the difference between throw and throws?
Answer:
- throw is used to manually throw an exception.
- throws is used to declare that a method may throw an exception.

✅ 2. What is the purpose of the finally block?
Answer:
- The finally block is used to write cleanup code (like closing files or releasing resources). It runs no matter what — even if an exception is not caught.

✅ 3. Can we have multiple catch blocks?
Answer:
- Yes, you can catch different types of exceptions using multiple catch blocks. Java checks from top to bottom, so the most specific exceptions should come first.

✅ 4. What is the difference between checked and unchecked exceptions?
Answer:
- Checked exceptions: must be handled or declared using throws (e.g., IOException).
- Unchecked exceptions: occur at runtime, and it's optional to handle them (e.g., ArithmeticException, NullPointerException).

✅ 5. What happens if an exception is not caught?
Answer:
- If not caught, Java's default exception handler will terminate the program and print an error stack trace.
*/