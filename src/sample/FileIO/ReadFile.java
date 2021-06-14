package sample.FileIO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Service.Account;
import sample.Service.Custom;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {
    public static ObservableList<Custom> readAccountCSVFile(String path) throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader br = new BufferedReader(fr);
        String content;
        ObservableList<Custom> newAccountList = FXCollections.observableArrayList();
        br.readLine();
        while((content = br.readLine())!=null) {
            String[] line = content.split(",");
            newAccountList.add(
                    new Custom(line[0],Integer.parseInt(line[1]),line[2],line[3],line[4],line[5])
            );
        }
        return  newAccountList;
    }
}
