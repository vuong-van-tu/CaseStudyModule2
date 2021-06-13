package sample.Controller;

import com.sun.deploy.security.CertStore;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerLogin implements Initializable {
    @FXML
    Button login;
//    Stage window;
    public void getLogin(ActionEvent event) throws IOException {
        Stage stage =(Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader =new FXMLLoader();
        loader.setLocation(getClass().getResource("D:\\CaseStudyModule2\\src\\sample\\Fxml\\managecustom.fxml"));
        Parent viewCustom = loader.load();
        Scene scene = new Scene(viewCustom);
        stage.setScene(scene);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
