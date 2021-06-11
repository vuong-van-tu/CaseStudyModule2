package sample.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Code.Custom;
import sample.Code.Gender;
import sun.plugin2.applet.FXAppletSecurityManager;

import javax.swing.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;


public class ControllerCrud implements Initializable {
    private Label label;
    @FXML
    private TextField ipname;
    @FXML
    private TextField ipage;
    @FXML
    private TextField ipaddress;
    @FXML
    private ChoiceBox ipgender;
    @FXML
    private TextField ipnumberphone;
    @FXML
    private TextField ipcmnd;
    @FXML
    private Button add;
    @FXML
    private Button edit;
    @FXML
    private TableView<Custom> tableCus;
    @FXML
    private TableColumn<Custom,String> name;
    @FXML
    private TableColumn<Custom,Integer> age;
    @FXML
    private TableColumn<Custom, String> address;
    @FXML
    private TableColumn<Custom, String> gender;
    @FXML
    private TableColumn<Custom, String> numberPhone;
    @FXML
    private TableColumn<Custom,String> cmnd;
    @FXML
    private Button delete;

    ObservableList<Custom> listCus = FXCollections.observableArrayList();

    public void add(ActionEvent event){
        listCus.add(new Custom(ipname.getText(),Integer.parseInt(ipage.getText()),ipaddress.getText(), (String) ipgender.getValue(),ipnumberphone.getText(),ipcmnd.getText()));

    }
    public void edit(ActionEvent event){
        System.out.println(listCus);
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> list = FXCollections.observableArrayList("Nam","Nữ","Khác");
        ipgender.setItems(list);
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        age.setCellValueFactory(new PropertyValueFactory<>("age"));
        address.setCellValueFactory(new PropertyValueFactory<>("address"));
        gender.setCellValueFactory(new PropertyValueFactory<>("gender"));
        numberPhone.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        cmnd.setCellValueFactory(new PropertyValueFactory<>("cmnd"));
        tableCus.setItems(listCus);

    }
}
