package object;


public class Fruit {
    String name;
    int price;
    String color;

    Fruit(String _name, int _price, String _color) {//?Constructor
        name = _name;
        price = _price;
        color = _color;
    }

    Fruit() {
        System.out.println("No Value");//?Possible
    }
    
    void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
    }
    

}
