
// Write a program to calculate difference between today and your birthday.

package DateTime_Function_and_Array;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Difference {

    public static void main(String[] args) throws ParseException {

        String thatDay = "12/12/1995 00:30:40 AM";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        Date date1 = formatter.parse(thatDay);
        Date date2 = new Date();
        long d = date2.getTime() - date1.getTime();
        long year = d / (1000L * 60 * 60 * 24 * 365);
        long day = d / (1000 * 60 * 60 * 24) % 365;
        long hour = (d / (1000 * 60 * 60)) % 24;
        long minutes = (d / (1000 * 60)) % 60;
        long second = (d / 1000) % 60;

        System.out.println("Year:" + year);
        System.out.println("Day:" + day);
        System.out.println("Hour:" + hour);
        System.out.println("Minute:" + minutes);
        System.out.println("Second:" + second);

    }
}
