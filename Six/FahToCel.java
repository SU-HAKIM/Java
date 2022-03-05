package Six;

import java.util.Scanner;

public class FahToCel {
    //c=5/9*(f-32);
    public static void main(String[] args) {
        int Fah;
        double Cel;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fahrenheit: ");
        Fah = input.nextInt();
        Cel = 0.556 * (Fah - 32);
        System.out.println("Celsius : "+Cel);
    }
}
