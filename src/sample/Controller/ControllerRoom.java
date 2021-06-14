package sample.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Service.BooleanRoom;
import sample.Service.Room;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerRoom implements Initializable {
    @FXML
    private TableView<Room> tableRoom;
    @FXML
    private TableColumn<Room, Boolean> status;
    @FXML
    private TableColumn<Room, String> idRoom;
    @FXML
    private TableColumn<Room, String> category;
    @FXML
    private TableColumn<Room, String> startDate;
    @FXML
    private TableColumn<Room, String> endDate;
    @FXML
    private TableColumn<Room, Integer> price;
    ObservableList<Room> listRoom = FXCollections.observableArrayList();

    public ControllerRoom() {
        listRoom.add(new Room(new BooleanRoom(true), "A101", "A", "10/6/2021", "12/6/2021"));
        listRoom.add(new Room(new BooleanRoom(false), "A102", "A", "", ""));
        listRoom.add(new Room(new BooleanRoom(true), "A103", "B", "1/6/2021", "2/6/2021"));
        listRoom.add(new Room(new BooleanRoom(false), "A104", "A", "", ""));
    }


//    public void rentFee() {
//        for (Room r : listRoom) {
//            if (status.getText().equals("Trống")) {
//                price.setText("");
//            }
//        }
//
//    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        status.setCellValueFactory(new PropertyValueFactory<>("status"));
        idRoom.setCellValueFactory(new PropertyValueFactory<>("idRoom"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));
        category.setCellValueFactory(new PropertyValueFactory<>("category"));
        startDate.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        endDate.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        tableRoom.setItems(listRoom);
    }
}
