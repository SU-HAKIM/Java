package date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateClass {
    public static void main(String[] args) {
        //?date
        Date date = new Date();
        // System.out.println(date);

        DateFormat format = new SimpleDateFormat("dd/MM/YYYY");//Formatter
        String curDate=format.format(date);//Formatted date
        // System.out.println(curDate);

        //?Time

        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime=formatter.format(time);
        System.out.println(formattedTime);
    }
}
