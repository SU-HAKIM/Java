package Task;

import java.util.ArrayList;
import java.util.Iterator;

//While Array is fixed sized,ArrayList is Dynamic Sized
//for each loo , iterator
//slow
// array.size
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();//Do not specify size
        //?adding elements

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(2, 100);
        // System.out.println(number.size());
        // System.out.println(number);//Array list is printable like this but Array is not

        // for (int x : number) {
        //     System.out.println(x);
        // }

        Iterator itr = number.iterator();

        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
        // }

        //?Removing Items
        // number.remove(2);
        // System.out.println(number);
        // number.removeAll(number);
        // System.out.println(number);

        //?Clear
        // number.clear();
        // // System.out.println(number);
        
        //* System.out.println(number.isEmpty());

        //* System.out.println(number.contains(20));

        //* System.out.println(number.indexOf(30));

        number.set(3, 50);
        // System.err.println(number);
        //* System.err.println(number.get(3));
    }
}
