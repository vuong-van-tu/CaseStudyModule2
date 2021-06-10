package sample.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManagerCustom {
    private List<Custom> listCustom = null;

    public ManagerCustom() {
        listCustom = new ArrayList<>();
    }

    public List<Custom> getListCustom() {
        return listCustom;
    }

    public void getListCustom(List<Custom> listCustom) {
        this.listCustom = listCustom;
    }

    public void add(Custom custom) {
        listCustom.add(custom);
    }

}
