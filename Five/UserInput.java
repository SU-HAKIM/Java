package Five;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        String name;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = input.nextLine();
        // name = input.next();//next() can not read word after a space
        System.out.println("Enter your age : ");
        age = input.nextInt();

        System.out.println("Hello, " + name + ".You are " + age);
    }
}