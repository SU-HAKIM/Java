package Task;

import java.util.Scanner;


public class CapOrSmall {
    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a latter ");
        System.out.print("= ");
        ch=input.nextLine().charAt(0);

        if(ch >= 'a' && ch <='z'){
            System.out.println(ch+" is a small Latter");
        }else if(ch >= 'A' && ch <='Z'){
            System.out.println(ch+" is a capital Latter.");
        } else {
            System.out.println(ch+" is not a Latter.");
        }
    }
}
