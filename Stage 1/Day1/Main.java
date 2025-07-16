import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Variables, Data Types, Operators

        String s = "Rifat";
        int age = 10;
        double size = 50.33;
        char c = 'A';
        float f = 50.5f;

        System.out.println("My name is: "+s);
        System.out.println("Age is: "+age);
        System.out.println("Room size: "+size);
        System.out.println("First Alphabate: "+c);
        System.out.println("Salary: "+f);


        // Arithmetic Operator
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        float sum = num1 + num2;
        
        System.out.println("Sum: "+sum);
        System.out.println("Addi: " +(num1 - num2));
        System.out.println("Multi: " +(num1 * num2));
        System.out.println("Division: " +(num1 / num2));
        System.out.println("Mod: " +(num1 % num2));

        double result = (double) num1 / num2;
        System.out.println("Type Cast: "+result);
        sc.close();

        //Assignment Operator
        int x = 3;
        int y = 2;
        x = x + y;
        System.out.println(x);

        //Relational Operator
        System.out.println("x == y: " +(x==y));
        System.out.println("x > y: "+(x > y));
        System.out.println("x < y: "+(x < y));
        System.out.println("x >= y: "+(x >= y));
        System.out.println("x <= y: "+(x <= y));
        System.out.println("x != y: "+(x != y));

        /*
=====================================================================================================
         ✅ Interview Questions
            What is the difference between int and Integer?
            ➤ int is a primitive type; Integer is a wrapper class in Java.

            How does Java handle type conversion?
            ➤ Java supports both implicit (widening) and explicit (narrowing) casting.

            What is a literal in Java?
            ➤ Fixed value assigned to a variable, like 100, 'A', true.

            How are == and .equals() different?
            ➤ == compares reference; .equals() compares content.

            What is a ternary operator?
            ➤ Shorthand for if-else: int max = (a > b) ? a : b;
            
=====================================================================================================
         */

        //  Control Statements (if, for, while, switch)
        //if,else
        int marks = 80;

        if (marks >= 80) {
            System.out.println("You got A+!");
        }
        else if (marks <= 80) {
            System.out.println("You missed A+!!");
        }
        else{
            System.out.println("Try again....");
        }

        System.out.println();
        //Loop
        //For
        System.out.println("For Loop");
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
        }
        System.out.println();

        //while
        System.out.println("While Loop");
        int j = 0;
        while (j <= 50) {
            System.out.println(j);
            j++;
        }
        System.out.println();

        //do-while
        System.out.println("do-while Loop");
        int k = 0;
        do{
            System.out.println(k);
            k++;
        }while(k<=10);

        //for-each
        System.out.println("For-each Loop");
        int[] numbers = new int[51];
        for (int i = 0; i <= 50; i++) {
            numbers[i] = i; 
        }

        // For-each loop
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println();
    

        //Switch case
        int digit = 2;

        switch (digit) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("two");
                break;
            
            default:
                break;
        }
        
        //Logical Operator
        int op1 = 10;
        int op2 = 20;

        if (op1 > 5 && op2 > 5 ) {
            System.out.println("Both are true!");
        }
        else if(op1 > 5 || op2 > 50){
            System.out.println("Atleast one condition is true...");
        }
        else{
            boolean isJavaFun = true;
            System.out.println("Is Java not fun? " + !isJavaFun);
        }

    }
}