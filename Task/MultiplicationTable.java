package Task;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i+" = "+i*n);
        }
    }
}
