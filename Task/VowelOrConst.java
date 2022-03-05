package Task;
import java.util.Scanner;

public class VowelOrConst {
    public static void main(String[] args) {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character ");
        System.out.print("= ");
        ch = input.next().charAt(0);
        String result = VowelConst(ch);
        System.out.println("You entered "+result);
    }
    
    public static String VowelConst(char _ch) {
        if (_ch == 'a' || _ch == 'e' || _ch == 'i' || _ch == 'o' || _ch == 'u') {
            return "Vowel";
        } else {
            return "Consonant";
        }
    }
}
