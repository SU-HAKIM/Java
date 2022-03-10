package object;

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student("Hakim", 3281);
        Student s2 = new Student("Hakim2", 3241);
        Student s3 = new Student("Hakim3", 3261);

        s1.displayInformation();
        s1.showCount();
        s2.displayInformation();
        s2.showCount();
        s3.displayInformation();
        s3.showCount();
    }
}
