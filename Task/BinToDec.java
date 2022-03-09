package Task;

public class BinToDec {
    public static void main(String[] args) {
        // String bin = "01000";// 8 4 2 1
        String Hex = "A";

        //* int decimal = Integer.parseInt(bin, 2);
        //* Integer decimal = Integer.parseInt(bin, 2);
        //* int decimal = Integer.parseInt(Oct, 8);
        int decimal = Integer.parseInt(Hex, 16);
        System.out.println(decimal);
    }
}
