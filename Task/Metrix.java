package Task;

import java.util.Scanner;

//Matrix=>Multi Dimensional Array

public class Metrix {
    public static void main(String[] args) {
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First Metrix Value : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter Second Metrix Value : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = input.nextInt();
            }
        }

        System.out.println("Sum of two Metrix : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((A[i][j] + B[i][j]));
                System.out.print((" "));
            }
            System.out.println();
        }
        
    }
}
