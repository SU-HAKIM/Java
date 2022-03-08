package Task;

import java.util.Scanner;

public class ArrayOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int[][] numbers = new int[3][4];
        int[][] numbers = new int[4][];//Later
        int k = 0;

        numbers[0] = new int[1];
        numbers[1] = new int[2];
        numbers[2] = new int[3];
        numbers[3] = new int[4];

        // System.out.println("Enter Array values : ");
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         numbers[i][j] = k;
        //         k++;
        //     }
        // }

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.out.print(" "+numbers[i][j] + " ");
        //     }
        //     System.out.println();
        // }

    System.out.println("Enter Array values : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                numbers[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" " + numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(numbers);
    }
}
