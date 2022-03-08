package Nine;

import java.util.Scanner;

public class Array {
    //Array in Java => You can only store data of same type
    public static void main(String[] args) {
        //Declare
        //int[] number;
        //Initialization / Creation
        //number = new int[10];
        // int[] number = new int[10];//10 => size/length
        //SAME => ini number[]=new int[10];
        // number[0] = 10;
        // number[1] = 10;
        // number[2] = 10;
        // number[3] = 10;
        // number[4] = 10;
        // number[5] = 10;

        // Scanner input = new Scanner(System.in);
        // number[0] = input.nextInt();
        // number[1] = input.nextInt();
        // number[2] = input.nextInt();
        // number[3] = input.nextInt();
        // number[4] = input.nextInt();
        
        // // int len = number.length;
        // int sum=0;
        // double avg;

        // for (int i = 0; i < number.length; i++) {
        //     sum += number[i];
        // }

        // avg = sum / number.length;

        // int max = number[0];

        // for (int i = 0; i < number.length; i++) {
        //     if (number[i] < max) {
        //         max = number[i];
        //     }
        // }

        //? For each loop

        // for (int x : number) {
        //     sum += x;
        // }

        // System.out.println("Sum : "+sum);
        //Types of Array
        // 2 Types
        // 1.One Dimensional Array
        // 2. Multi Dimensional Array => of 2 types
            //1.2D Array
            //2.3D Array
            int[][] numbers = new int[2][3];

            numbers[0][0]=10;
            numbers[0][1]=10;
            numbers[0][2]=10;
            numbers[1][0]=10;
            numbers[1][1]=10;
            numbers[1][2]=10;
            for (int[] x : numbers) {
                for (int y : x) {
                    System.out.print(y+" ");
                }
                System.out.println();
            }
        
    }
}
