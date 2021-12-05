package utillities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtilis {
    public static String returnNextMonth() {
        // Creating Date Object
        Date dNow = new Date();

        // Creating calender object for Gregorian Calender
        Calendar calendar = new GregorianCalendar();

        // Set Calender date to current date
        calendar.setTime(dNow);

        // create object of SimpleDateFormat
        // Defining Date Front to - example: (Dec-2022)
        SimpleDateFormat sdf = new SimpleDateFormat("MMM-YYYY");

        // Incrementing the current month
        calendar.add(Calendar.MONTH, 1);

        //Generating the date based on the specified format
        String date = sdf.format(calendar.getTime());

        return date;
    }
}
