package Task;

import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        int n,result=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
