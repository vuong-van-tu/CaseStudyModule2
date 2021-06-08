package sample.Controller;

import java.time.LocalDate;

public class Custom {
    private String name;
    private int age;
    private String address;
    private String gender;
    private String phoneNumber;
    private LocalDate startDate;
    private LocalDate endDate;
    public Custom() {
    }

    public Custom( String name, int age, String address, String gender, String phoneNumber,LocalDate startDate,LocalDate endDate) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int date(){
        return endDate.getDayOfYear()-startDate.getDayOfYear();
    }

    @Override
    public String toString() {
        return "Khách hàng{" +
                "tên: " + name +
                ", tuổi : " + age +
                ", địa chỉ : " + address +
                ", giới tính : " + gender +
                ", số điện thoại : " + phoneNumber +
                '}';
    }
}
