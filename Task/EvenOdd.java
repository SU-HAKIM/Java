package Task;

import java.util.Scanner;

public class EvenOdd {
    //Even Odd
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number : ");
        Scanner input = new Scanner(System.in);
        num=input.nextInt();

        String result = EvenOrOdd(num);
        System.out.println("You entered a "+result+" number.");
    }
    
    public static String EvenOrOdd(int _num) {
        if (_num % 2 == 0) {
            return "Even";
        }else{
            return "Odd";
        }
    }
}
