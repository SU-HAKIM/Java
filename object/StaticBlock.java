package object;

public class StaticBlock {
    String role = "Programmer";//*Instance variable
    static String name;//*static variable
    static int age;//*static variable

    static {
        name = "Hakim";
        age = 17;
    }

    void setName(){
        String name;//*Local variable.Scoped.
    }

    static void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
    
    public static void main(String[] args) {
        StaticBlock.displayInfo();
    }
}


//?Static block is executed before main method