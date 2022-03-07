package Task;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n,count=0;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        n = input.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i==0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Prime");
        } else {
            System.out.println("Not");
        }
    }
}
