package Problems.Control_Statements;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // char ch;
        // System.out.print("Enter Character: ");
        // ch = sc.next().charAt(0);

        // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
        //     System.out.println("Vowel");
        // }
        // else if(ch >= 'a' && ch <= 'z'){
        //     System.out.println("Consonant");
        // }
        // else{
        //     System.out.println("Not an alphabet character.");
        // }
        // sc.close();

        //Switch Case
        Scanner input = new Scanner(System.in); 
        int marks;
        System.out.print("Enter Marks: ");
        marks = input.nextInt();

        if (marks < 0 && marks > 100) {
            System.out.println("Please enter mark between 0 to 100");
        }
        else{
            switch (marks / 10) {
                case 10:
                case 9:
                    System.out.println("Grade A"); //90-99
                    break;
                case 8:
                    System.out.println("Grade B"); //80-89
                    break;
                case 7:
                    System.out.println("Grade C"); //70-79
                    break;
                case 6:
                    System.out.println("Grade D"); //60-69
                    break;
                case 5:
                    System.out.println("Grade E"); //50-59
                    break;
                default:
                    System.out.println("Grade F"); //40-49
                    break;
            }
        }
        input.close();
    }
}
