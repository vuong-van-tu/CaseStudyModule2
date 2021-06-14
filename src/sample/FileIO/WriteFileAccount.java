package sample.FileIO;

import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import sample.Service.Account;
import sample.Service.Custom;

import java.io.*;
import java.util.List;

public class WriteFileAccount {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String FUND_FILE_HEADER = "user name , password";

    public static void writeFileAccount(String path, ObservableList<Account> listAccount) throws IOException {
        FileWriter fw = new FileWriter(path,true);
        BufferedWriter bf = new BufferedWriter(fw);
//        fw.append(FUND_FILE_HEADER);
//        fw.append(NEW_LINE_SEPARATOR);
        for (Account account:listAccount) {
            fw.append(account.getUsername());
            fw.append(COMMA_DELIMITER);
            fw.append(account.getPassword());
//            fw.append(NEW_LINE_SEPARATOR);
        }
        fw.flush();
        fw.close();
        bf.close();
    }

}
