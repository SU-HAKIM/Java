package object;

public class Student {
    String name;
    int id;
    static String universityName = "LU";//do not take extra space

   // int count = 0;//?Always starts from 0

    static int count = 0;//?Continue incrementing

    Student(String _name,int _id){
        name=_name;
        id = _id;
        count++;
    }

    void displayInformation() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("University Name : " + universityName);
    }
    
    static void showCount() {
        //1.static methods can not use non-static member
        //2.'this and super' keyword can not be used in static methods
        System.out.println(count);
    }

   
}
