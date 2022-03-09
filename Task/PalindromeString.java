package Task;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String s1;
        Scanner input = new Scanner(System.in);

        s1 = input.nextLine();

        StringBuffer sb = new StringBuffer(s1);

        String s2=sb.reverse().toString();

        if (s1.equals(s2)) {
            System.out.println(sb+" is Palindrome");
        } else {
            System.out.println(sb+" is Not");
        }

        

    }
}
