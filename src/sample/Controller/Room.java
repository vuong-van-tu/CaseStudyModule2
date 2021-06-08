package sample.Controller;

import java.util.ArrayList;
import java.util.List;

public class Room {
    //    List<Custom> customs = new ArrayList<Custom>();
    Custom customs = new Custom();
    private final String ROOM_A = "A";
    private final String ROOM_B = "B";
    private final int PRICE_A = 2000000;
    private final int PRICE_B = 1300000;
    private String category;
    private int price;
    private String idRoom;

    public Room(String category, int price, String idRoom) {
        this.category = category;
        this.price = price;
        this.idRoom = idRoom;
    }

    public Room() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(String category) {
        switch (category) {
            case "A":
                this.price = PRICE_A;
                break;
            case "B":
                this.price = PRICE_B;
                break;
        }
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public int rentFee() {
        return customs.date() *getPrice();
    }

    @Override
    public String toString() {
        return "Room{" +
                "Giá : " + price +
                ", số phòng : " + idRoom +
                '}';
    }
}
