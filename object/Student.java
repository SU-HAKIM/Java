package object;

public class Student {
    String name;
    int id;
    static String universityName = "LU";

    int count = 0;

    Student(String _name,int _id){
        name=_name;
        id = _id;
        count++;
    }

    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Unversity Name : " + universityName);
    }
    
    void showCount() {
        System.out.println(count);
    }
}
