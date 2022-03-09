package Ten;

//String is an Object in java

public class StringTest {
    public static void main(String[] args) {
        //?One way
        String s1 = "Sadiul ";
        String s2 = new String("Hakim");
        char[] ch1 = { 'a', 'n', 'i', 's' };
        // System.out.println(ch1);
        // System.out.println(s1);
        //* System.out.println(s1.length());

        //* System.out.println(s1.equals(s2));
        // //! == compares reference does not compare value
        //* System.out.println(s1.contains(s2));


        //* System.out.println(s1.equalsIgnoreCase(s2));

        //* System.out.println(s1.isEmpty());

        //?way Two
        // String concatenated = s1 + s2;
        String concatenated = s1.concat(s2);
        String UpperName = concatenated.toUpperCase();
        String LowerName = concatenated.toLowerCase();
        System.out.println(LowerName);
        System.out.println(LowerName.startsWith("sadi"));
        System.out.println(LowerName.endsWith("im"));
    }
}
