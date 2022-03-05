package Task;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        //Required Variables
        int base, height;
        double area;
        //Scanner Instance
        Scanner input = new Scanner(System.in);
        //Taking user input
        System.out.println("Enter base of Triangle :");
        base = input.nextInt();
        System.out.println("Enter height of Triangle :");
        height = input.nextInt();
        //Calculating area
        area = .5 * base * height;
        //Printing
        System.out.printf("%.2f",area);
    }
}
