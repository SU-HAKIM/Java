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

        // String concatenated = s1 + s2;
        String concatenated = s1.concat(s2);
        String UpperName = concatenated.toUpperCase();
        String LowerName = concatenated.toLowerCase();
        // System.out.println(LowerName);
        // System.out.println(LowerName.startsWith("sadi"));
        // System.out.println(LowerName.endsWith("im"));

        String[] names = { "Hakim", "Antor", "Jim", "Ashikur" };
        // System.out.println(names);Not printable
        for (String x : names) {
            // System.out.println(x);
        }

        String bd = "Bangladesh is my country";

        // System.out.println(bd.charAt(0));
        // System.out.println(bd.codePointAt(0));//Asci Code
        // System.out.println(bd.indexOf("is")); 
        // System.out.println(bd.lastIndexOf("s")); 
        // System.out.println(bd.trim()); 

        // System.out.println(bd.replace("my", "our"));
        String[] words = bd.split(" ");

        for (String x : words) {
            // System.out.println(x);
        }

        //?way Two
        StringBuffer sr = new StringBuffer("Hakim");
        //main string created by StringBuffer can be changed.replace kind of methods method can change main string.

        //* System.out.println(sr.append(12));
        //* System.out.println(sr.reverse());
        //* System.out.println(sr.delete(0, 2));
        sr.setLength(4);
        // System.err.println(sr);//Main string changed
        //?way Three
        StringBuilder str = new StringBuilder("Hakim");//same as StringBuffer changeable
        str.append(123);
        str.reverse();
        str.delete(0, 3);
        str.reverse();
        System.out.println(str);
    }
}
