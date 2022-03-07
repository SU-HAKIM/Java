package Task;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        int sum = 0, r, tmp, n;
        System.out.println("Enter a Digit : ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        tmp = n;
        //123%10
        //123/10
        //12%10
        //12/10
        //1%10
        //0
        //1

        while (tmp != 0) {
            r = tmp % 10;
            sum += r;//3
            tmp = tmp / 10;
        }

        System.out.println(sum);
    }
}
