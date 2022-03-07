package Task;

import java.util.Scanner;

//121=>121(Reverse) //121 Palindrome
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, r, n,tmp;
        System.out.println("Enter a Number : ");
        n = input.nextInt();
        tmp = n;
        while (tmp != 0) {
            r = tmp % 10;
            sum = sum * 10 + r;
            tmp = tmp / 10;
        }

        if (sum == n) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not");
        }
    }
}
