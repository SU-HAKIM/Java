package object;

public class Teacher {
    String name, gender, email;
    
    void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Email : " + email);
    }
    
    void setInfo(String _name, String _email, String _Gender) {
        name = _name;
        email = _email;
        gender = _Gender;
    }
}
