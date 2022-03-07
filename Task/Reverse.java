package Task;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, n, r, tmp;

        System.out.println("Enter a number : ");
        n = input.nextInt();
        tmp=n;
        while (tmp != 0) {
            r = tmp % 10;
            sum = sum * 10 + r;
            tmp = tmp / 10;
        }

        System.out.println(sum);
    }
}

