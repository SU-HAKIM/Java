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

        // System.out.println(d2);

        //?primitive string autoBoxing


        double d = 10.2;
        boolean b = true;

        // String j = Double.toString(d);
        // String j = Integer.toString(x);
        String j = Boolean.toString(b);

        // System.out.println(j);

        //?primitive string unboxing

        String s = "32";
        // int n = Integer.parseInt(s);
        double n = Double.parseDouble(s);
        System.out.println(n);

        int m = Integer.valueOf(s);
        double m2 = Double.valueOf(s);

        System.out.println(m);
        System.out.println(m2);


    
    }
}
