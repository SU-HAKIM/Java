package Wrapper;

public class WrapperClass {
    public static void main(String[] args) {
        int x = 10;

        Integer y = Integer.valueOf(x);
        // System.out.println(y);

        Integer z = x;//AutoBoxing(Integer.valueOf(x))
        Integer r = 20;//AutoBoxing(Integer.valueOf(20))

        // System.out.println(z);
        // System.out.println(r);

        Double d1 = 10.4;//AutoBoxing

        // System.out.println(d1);

        double d2 = d1.doubleValue();//UnBoxing.intValue for UnBoxing to int

        System.out.println(d2);


    
    }
}
