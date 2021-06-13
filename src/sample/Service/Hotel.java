package sample.Service;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Custom> customs;
    private Room rooms;
    private final String ROOM_A = "A";
    private final String ROOM_B = "B";
    private final int PRICE_A = 2000000;
    private final int PRICE_B = 1300000;
    private List<Hotel> hotels=null;

    public Hotel() {
        hotels = new ArrayList<>();
    }

    public Hotel(List<Custom> customs, Room rooms) {
        this.customs = customs;
        this.rooms = rooms;

    }

    @Override
    public String toString() {
        return "Hotel{" +
                "Customs" + customs.toString() +"\n"+
                 rooms.toString() +
                '}';
    }
}
