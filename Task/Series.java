package Task;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        double n;
        double result=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the last number of the series : ");
        n = input.nextDouble();

        for (double i = 1.5; i <= n; i++) {
            System.out.print(i + " ");
            result *=  (i*i);
        }
        System.out.println();
        System.out.println(result);
        
    }
}