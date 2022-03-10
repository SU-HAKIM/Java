package object;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();

        t1.setInfo("Hakim", "bmsuhakim@gmail.com", "Male");


        t2.setInfo("Sadiul Hakim", "sadiulhakim@gmail.com", "Male");

        t2.displayInfo();
        System.out.println();

        t1.displayInfo();
    }

    
}
