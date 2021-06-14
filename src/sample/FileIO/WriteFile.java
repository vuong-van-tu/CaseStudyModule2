package sample.FileIO;

import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.Service.Account;
import sample.Service.Custom;

import java.io.*;
import java.util.List;

public class WriteFile {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FUND_FILE_HEADER = "Tên,tuổi,địa chỉ,giới tính,số điện thoại,chứng minh nhân dân";

    public static void writeFileCustomer(String path, ObservableList<Custom> listCustom) throws IOException {
        FileWriter fw = new FileWriter(path);
        BufferedWriter bf = new BufferedWriter(fw);
            fw.append(FUND_FILE_HEADER);
            fw.append(NEW_LINE_SEPARATOR);
            for (Custom custom:listCustom) {
                fw.append(custom.getName());
                fw.append(COMMA_DELIMITER);
                fw.append(String.valueOf(custom.getAge()));
                fw.append(COMMA_DELIMITER);
                fw.append(custom.getAddress());
                fw.append(COMMA_DELIMITER);
                fw.append(custom.getGender());
                fw.append(COMMA_DELIMITER);
                fw.append(custom.getPhoneNumber());
                fw.append(COMMA_DELIMITER);
                fw.append(custom.getCmnd());
                fw.append(NEW_LINE_SEPARATOR);
            }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Lưu file thành công");
        alert.show();
        fw.flush();
        fw.close();
        bf.close();
    }

}
