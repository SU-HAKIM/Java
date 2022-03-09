package Task;

import java.util.ArrayList;
import java.util.Collections;

class ArrayListSort{
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        ArrayList<String> str = new ArrayList<String>();

        number.add(10);
        number.add(1);
        number.add(19);
        number.add(30);
        number.add(0);

        str.add("Hakim");
        str.add("Abdul");
        str.add("Sadi");
        str.add("Jim");

        Collections.sort(number);//Ascending
        Collections.sort(str);//Ascending

        Collections.sort(str, Collections.reverseOrder());//Descending

        System.out.println(number);
        System.out.println(str);

    }
}