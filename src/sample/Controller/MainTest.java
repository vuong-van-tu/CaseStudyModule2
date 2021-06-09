package sample.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainTest {
    public static void main(String[] args) throws ParseException {
        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar();

        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        cal1.set(2009, 3, 1);
        cal2.set(2010, 9, 31);
        System.out.println("Days= "+daysBetween(cal1.getTime(),cal2.getTime()));
    }

    private static int daysBetween(Date time, Date time1) {
        return (int)( (time1.getTime() - time.getTime()) / (1000 * 60 * 60 * 24));
    }
}
