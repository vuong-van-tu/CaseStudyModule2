package sample.Controller;


import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Hotel> list = new ArrayList<>();
        Custom a=new Custom("Tu", 20, "hn", "nam", "0338376563", "033201005564");
        Custom b=new Custom("Tu", 20, "hn", "nam", "0338376563", "033201005564");
        Custom c=new Custom("Tu", 20, "hn", "nam", "0338376563", "033201005564");
        Custom d=new Custom("Tu", 20, "hn", "nam", "0338376563", "033201005564");
        ManagerCustom managerCustom = new ManagerCustom();
        managerCustom.add(a);
        managerCustom.add(b);
        managerCustom.add(c);
        managerCustom.add(d);
        Room r=new Room(true, "A401", "A","10/3/2021", "15/3/2021");
        Hotel hotel = new Hotel(managerCustom.getListCustom(),r);
        System.out.println(hotel);
    }
}
