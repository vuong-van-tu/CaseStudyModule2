package sample.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import sample.Service.BooleanRoom;
import sample.Service.Room;


import java.io.IOException;
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
    @FXML
    private TableColumn<Room, Button> action;
    ObservableList<Room> listRoom = FXCollections.observableArrayList();
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
//    private Boolean statuss = false;
    public ControllerRoom() {
        button1 = new Button("Room1");
        button1.setOnAction(event -> {
            if (!status.getText().equals("Trống")){
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../Fxml/managecustom.fxml"));
                Pane myPane = null;
                try {
                    myPane = (Pane) loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(myPane);
                stage.setScene(scene);
            }

        });
        button2 = new Button("Room2");
        button2.setOnAction(event -> {
            if (!status.getText().equals("Trống")){
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../Fxml/managecustomroom2.fxml"));
                Pane myPane = null;
                try {
                    myPane = (Pane) loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(myPane);
                stage.setScene(scene);
            }
        });
        button3 = new Button("Room3");
        button3.setOnAction(event -> {
            if (!status.getText().equals("Trống")){
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../Fxml/managecustomroom3.fxml"));
                Pane myPane = null;
                try {
                    myPane = (Pane) loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(myPane);
                stage.setScene(scene);
            }
        });
        button4 = new Button("Room4");
        button4.setOnAction(event -> {
            if (!status.getText().equals("Trống")){
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../Fxml/managecustomroom4.fxml"));
                Pane myPane = null;
                try {
                    myPane = (Pane) loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Scene scene = new Scene(myPane);
                stage.setScene(scene);
            }
        });
        listRoom.add(new Room(new BooleanRoom(true), "A101", "A", "10/6/2021", "12/6/2021",button1));
        listRoom.add(new Room(new BooleanRoom(false), "A102", "A", "", "",button2));
        listRoom.add(new Room(new BooleanRoom(true), "A103", "B", "1/6/2021", "2/6/2021",button3));
        listRoom.add(new Room(new BooleanRoom(false), "A104", "A", "", "",button4));
    }




    @Override
    public void initialize(URL location, ResourceBundle resources) {
        status.setCellValueFactory(new PropertyValueFactory<>("status"));
        idRoom.setCellValueFactory(new PropertyValueFactory<>("idRoom"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));
        category.setCellValueFactory(new PropertyValueFactory<>("category"));
        startDate.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        endDate.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        action.setCellValueFactory(new PropertyValueFactory<>("Action"));
        tableRoom.setItems(listRoom);
    }


}
