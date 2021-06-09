package sample.Controller;

import java.time.LocalDate;
import java.util.Date;

public class Custom {
    private String name;
    private int age;
    private String address;
    private String gender;
    private String phoneNumber;
    private Date startDate;
    private Date endDate;
    public Custom() {
    }

    public Custom( String name, int age, String address, String gender, String phoneNumber,Date startDate,Date endDate) {
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int date(){
        return (int)( (endDate.getTime() -startDate.getTime()) / (1000 * 60 * 60 * 24));
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
