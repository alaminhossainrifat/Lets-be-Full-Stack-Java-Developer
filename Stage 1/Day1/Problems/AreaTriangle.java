package Problems;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        double base, height, area;

        System.out.print("Enter base: ");
        base = input.nextDouble();
        System.out.print("Enter height: ");
        height = input.nextDouble();

        area = 0.5 * base * height;
        System.out.println("Area of triangle: "+area);

        input.close();
    }
}
