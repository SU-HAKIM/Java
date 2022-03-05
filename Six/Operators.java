package Six;

public class Operators {
    public static void main(String[] args) {
        //!Operators
        //?1.Arithmtic
        // System.out.println(10 % 3);
        int res1;
        double res2;

        res1 = 20 / 10;
        res2 = (double) 20 / 10;//Type Casting
        
        // System.out.println(res1);
        // System.out.println(res2);

        //?Assignment Operator
        int x,result;
        x = 10;//assign 10
        x += 10;//20
        x -= 5;//15
        x *= 2;//30
        x /= 3;//10
        x %= 3;//1

        // System.out.println(x);

        //?Unary Operators
        result = +x;//1
        result = -x;//-1
        result = -x;//-1
        // System.out.println(result);
        result = ++x;//First positive the number then plus one = 2
        result = x++;//2 (3 after calling again)
        result = --x;//But does not negative the value
        System.out.println(result);
        result = x--;

        // System.out.println(result);

        //?Relational Operator

    }
}
