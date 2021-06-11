package sample.Controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerTableCustom implements Initializable {
    @FXML
    private TableView customs;
    @FXML
    private TableColumn colName;
    @FXML
    private TableView colAge;
    @FXML
    private TableView colAddress;
    @FXML
    private TableView colGender;
    @FXML
    private TableView colNumberPhone;
    @FXML
    private TableView colCmnd;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
