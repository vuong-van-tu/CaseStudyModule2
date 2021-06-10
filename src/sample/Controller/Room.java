package sample.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Room {
    private boolean status ;
    private String idRoom;
    private String category;
    private final int PRICE_A = 2000000;
    private final int PRICE_B = 1300000;
    private String startDate;
    private String endDate;
    Hotel hotel = new Hotel();

    public Room() {
    }

    public Room(boolean status, String idRoom, String category,String startDate,String endDate) {
        this.status = status;
        this.idRoom = idRoom;
        this.category = category;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getPrice() {
        return getPriceRoom();
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }
    public int getPriceRoom() {
        if (category.equals("A")){
            return  PRICE_A;
        }else {
            return PRICE_B;
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
    public int rentFee() {
        return (int) date() * getPrice();
    }




    @Override
    public String toString() {
        return "Room{" +
                "Trạng thái : " + status +
                ", số phòng : " + idRoom +
                ", số ngày thuê : "+date()+
                ", tiền phòng : " + rentFee() +
                '}';
    }
}
