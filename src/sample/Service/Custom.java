package sample.Service;

import javafx.collections.ObservableList;

public class Custom {
    private String name;
    private int age;
    private String address;
    private String gender;
    private String phoneNumber;
    private String cmnd;

    public Custom(String text, int age, String ipaddressText, ObservableList items, String ipnumberphoneText, String ipcmndText) {
    }

    public Custom(String name, int age, String address, String gender, String phoneNumber, String cmnd) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.cmnd = cmnd;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }



    @Override
    public String toString() {
        return "\n"+"Khách hàng{" +
                "tên: " + name +
                ", tuổi : " + age +
                ", địa chỉ : " + address +
                ", giới tính : " + gender +
                ", số điện thoại : " + phoneNumber +
                ", CMND : " + cmnd +
                '}';
    }
}
