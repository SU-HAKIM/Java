package Task;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int result = 0;
        int m, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        m = input.nextInt();
        System.out.println("Enter second number: ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {
            if (i % 2 != 0) {
                result += i;
            }
        }
        System.out.println("Result = "+result);
    }
}
