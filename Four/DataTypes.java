package Four;

public class DataTypes {
    //Variables and DataTypes
    public static void main(String[] args) {
        int num = 10000;//Signed Integer
        short sh = 1000;//Signed Integer
        byte by = 100;
        float fl = 10.12f;
        double db = 100.123;
        char ch = 'a';
        boolean java = true;
        long lg = 1000000000;

        //Formate specifiers
        System.out.printf("%b\n",java);
        System.out.printf("%c\n",ch);
        System.out.printf("%d\n",num);
        System.out.printf("%d\n",sh);
        System.out.printf("%d\n",lg);
        System.out.printf("%d\n",by);
        System.out.printf("%.2f\n",fl);
        System.out.printf("%.2f\n",db);
    }
}
