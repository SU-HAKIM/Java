package object;

public class StaticBlock {
    static String name;
    static int age;

    static {
        name = "Hakim";
        age = 17;
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