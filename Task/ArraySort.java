package Task;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 1;
        arr[4] = 24;

        Arrays.sort(arr);//Ascending

        for (int a : arr) {
            System.out.println(a);
        }
    }
}
