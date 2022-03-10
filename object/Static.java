package object;

public class Static {
    public static void main(String[] args) {

        Student s1 = new Student("Hakim", 3281);
        s1.displayInformation();
        Student.showCount();

        Student s2 = new Student("Hakim2", 3241);
        s2.displayInformation();
        Student.showCount();

        Student s3 = new Student("Hakim3", 3261);
        s3.displayInformation();
        Student.showCount();
    }
}


/**
 * 1. Static variables can be called using class name
 * 2. Static Variables do not take extra memory space for same property
 * 3. They are always same do not start from first when new instance is created
 */