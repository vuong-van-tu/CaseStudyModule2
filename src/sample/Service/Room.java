package sample.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Room {
    private BooleanRoom status ;
    private String idRoom;
    private String category;
    private final int PRICE_A = 2000000;
    private final int PRICE_B = 1300000;
    private String startDate;
    private String endDate;
    Hotel hotel = new Hotel();

    public Room() {
    }

    public Room(BooleanRoom status, String idRoom, String category,String startDate,String endDate) {
        this.status = status;
        this.idRoom = idRoom;
        this.category = category;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public BooleanRoom isStatus() {
        return status;
    }

    public void setStatus(BooleanRoom status) {
        this.status = status;
    }

    public int getPrice() {
        return getPriceRoom();
    }

    public String getIdRoom() {
        return idRoom;
    }
    public long date() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = null;
        Date date2 = null;
        long date = 0;
        try {
            date1 = simpleDateFormat.parse(startDate);
            date2 = simpleDateFormat.parse(endDate);
            long millis = date2.getTime() - date1.getTime();
            date = (millis / (24 * 60 * 60 * 1000) + 1);
        } catch (ParseException e) {
            System.out.println("Error!!!");
        }
        return date;
    }
    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }
    public int getPriceRoom() {
        if (category.equals("A")){
            return Integer.parseInt( String.valueOf(PRICE_A*date()));
        }else {
            return Integer.parseInt( String.valueOf(PRICE_B*date()));
        }
    }
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public BooleanRoom getStatus() {
        return status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
