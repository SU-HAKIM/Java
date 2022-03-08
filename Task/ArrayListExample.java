package Task;

import java.util.ArrayList;

//While Array is fixed sized,ArrayList is Dynamic Sized
//for each loo , iterator
//slow
// array.size
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();//Do not specify size
        //adding elements

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(2, 100);
        System.out.println(number.size());
        System.out.println(number);//Array list is printable like this but Array is not

        for (int x : number) {
            System.out.println(x);
        }
    }
}
