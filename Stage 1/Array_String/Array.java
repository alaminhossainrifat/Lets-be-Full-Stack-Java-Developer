import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        
        /*
        double[] num = new double[5]; // Array declaration
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextDouble(); // Input using Array
        }
        for (int i = 0; i < num.length; i++) {
            sum += num[i]; // Calculate sum using loop
        }
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Sum: " + df.format(sum));
        //System.out.printf("Sum = .2f",sum);
        //System.out.println("Sum = " + sum);
        sc.close();
        */

        /* 
        double[] number = {10.5, 23.7, 5.8, 99.9, 67.3};
        double max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (max < number[i]) {
                max = number[i];
            }
        }
        System.out.print("Maximum Number: "+max);
        System.out.println(); 

        double min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (min > number[i]) {
                min = number[i];
            }
        }
        System.out.print("Minimum Number: "+min);

         */

         /*
         double[] num = {10.5, 20.5, 30.3};
         double max = num[0];
         for(double x : num){
            if(max < x){
                max = x;
            }
         }
         System.out.print("Maximum Number: "+max);
         System.out.println();

         double min = num[0];
         for (double d : num) {
            if (d < min) {
                min = d;
            }
         }
         System.out.print("Minimun Number: "+min);
         */

         /* 
         Scanner sc = new Scanner(System.in);
         int [][] matrix = new int[2][3]; //row = 2 : col = 3
         
         System.out.print("Enter 2x3 matrix: ");
         for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                matrix[i][j] = sc.nextInt();
            }
         }

         for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         }
        */

        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        System.out.println("Before Sorting: "+num);
        

        Collections.sort(num);
        System.out.println("After Ascending: "+num);

        Collections.sort(num,Collections.reverseOrder());
        System.out.println("After des. order: "+num);
    }
}
