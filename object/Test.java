package object;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();

        t1.name = "Hakim";
        t1.gender = "Male";
        t1.email = "bmsuhakim@gmail.com";

        t2.name = "Sadiul Hakim";
        t2.gender = "Male";
        t2.email = "sadiulhakim@gmail.com";

        t2.displayInfo();
    }

    
}
