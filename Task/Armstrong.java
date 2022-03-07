package Task;

import java.util.Scanner;

/**
 * !=153
 * =1^3+5^3+3^3
 * =1+125+27
 * !=153
 * 
 * =>153 armstrong
 */

public class Armstrong {
    public static void main(String[] args) {
        int n, r, tmp, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = input.nextInt();

        tmp = n;

        while (tmp != 0) {
            r = tmp % 10;
            sum += r * r * r;
            tmp = tmp / 10;
        }

        if (sum == n) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not");
        }
    }
}
