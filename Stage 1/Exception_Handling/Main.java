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