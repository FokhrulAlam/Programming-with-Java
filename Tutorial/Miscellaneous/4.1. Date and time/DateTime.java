package programmingwithjava.tutorial.miscellaneous;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime {
    public static void main(String[] args) {
        /**
         * print current date
         */
        Date date = new Date(); //creating a reference date
        DateFormat formattedDate = new SimpleDateFormat("MM/dd/YYYY");  // inheritance
        String currentDate = formattedDate.format(date);    //it produces a string
        System.out.println("Current date: "+currentDate);

        /**
         * print current time
         */
        LocalTime time = LocalTime.now();   //we already got the local time
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("hh:mm:ss");
        String currentTime = time.format(formattedTime);
        System.out.println("Current local time: "+currentTime);

    }
}
