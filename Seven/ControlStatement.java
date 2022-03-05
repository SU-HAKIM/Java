package Seven;

import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        //?Selection
        //1.if
        //2.if else
        //3.switch
        int num;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a Number");
        num = input.nextInt();

        if (num > 0) {
            System.out.println("The number you entered is greater than 0");
        } else if (num < 0) {
            System.out.println("The number you entered is smaller than 0");
        } else {
            System.out.println("The number you entered is 0");

        }
    }
}
