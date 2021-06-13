package sample.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Service.Custom;

import java.net.URL;
import java.util.*;


public class ControllerCustomer implements Initializable {
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
    private TableView<Custom> tableCus1;
    @FXML
    private TableColumn<Custom,String> name1;
    @FXML
    private TableColumn<Custom,Integer> age1;
    @FXML
    private TableColumn<Custom, String> address1;
    @FXML
    private TableColumn<Custom, String> gender1;
    @FXML
    private TableColumn<Custom, String> numberPhone1;
    @FXML
    private TableColumn<Custom,String> cmnd1;
    @FXML
    private Button delete;
    @FXML
    private TextField ipdelete;
    @FXML
    private TextField ipedit;
    @FXML
    private TextField ipfind;


    ObservableList<Custom> listCus = FXCollections.observableArrayList();

    public ControllerCustomer() {
        listCus.add(new Custom("Tú",20,"Hà Nội","Nam","0338376563","033201005564"));
        listCus.add(new Custom("Tú",27,"Hưng Yên","Nam","0334319874","033225122001"));
        listCus.add(new Custom("Chiến",25,"Hà Nội 2","Nam","0345989349","109309435783"));
        listCus.add(new Custom("Chương",29,"Nam Định","Nam","0338390843","913940928329"));
    }

    public void add(ActionEvent event){
        listCus.add(new Custom(ipname.getText(),Integer.parseInt(ipage.getText()),ipaddress.getText(), (String) ipgender.getValue(),ipnumberphone.getText(),ipcmnd.getText()));

    }
    public void edit(ActionEvent event){
        for (Custom cus:listCus) {
            if (ipedit.getText().equals(cus.getCmnd())){
                listCus.removeIf(custom -> ipedit.getText().equals(custom.getCmnd()));
                listCus.add(new Custom(ipname.getText(),Integer.parseInt(ipage.getText()),ipaddress.getText(), (String) ipgender.getValue(),ipnumberphone.getText(),ipcmnd.getText()));
            }
        }
    }
    public void delete(ActionEvent event){
        listCus.removeIf(custom -> ipdelete.getText().equals(custom.getCmnd()));
    }
    public ObservableList<Custom> findByName(){
        ObservableList<Custom> listName = FXCollections.observableArrayList();
        for (Custom cus:listCus) {
            if (ipfind.getText().equals(cus.getName())){
                listName.add(cus);
            }
        }
        return listName;
    }
    public void find(){
        name1.setCellValueFactory(new PropertyValueFactory<>("name"));
        age1.setCellValueFactory(new PropertyValueFactory<>("age"));
        address1.setCellValueFactory(new PropertyValueFactory<>("address"));
        gender1.setCellValueFactory(new PropertyValueFactory<>("gender"));
        numberPhone1.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        cmnd1.setCellValueFactory(new PropertyValueFactory<>("cmnd"));
        tableCus1.setItems(findByName());
        ipfind.clear();
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
