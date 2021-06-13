package sample.Service;

public class Employee {
    private String id;
    private String name;
    private int age;
    private String address;
    private String gender;
    private int salary;
    private String phoneNumber;
    private String typeEmployee;
    private int h;
    public Employee(){
    }

    public Employee(String id, String name, int age, String address, String gender, String typeEmployee,int h, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.typeEmployee = typeEmployee;
        this.phoneNumber = phoneNumber;
        this.h = h;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getSalary() {
        if (typeEmployee.equals("fulltime")){
            return 4992000 +500;
        }else if (typeEmployee.equals("parttime")){
            return h * 25000;
        }else {
            return 0;
        }
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTypeEmployee() {
        return typeEmployee;
    }

    public void setTypeEmployee(String typeEmployee) {
        this.typeEmployee = typeEmployee;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Nhân viên{" +
                "tên: " + name +
                ", tuổi: " + age +
                ", địa chỉ: " + address +
                ", giới tính : " + gender +
                ", lương : " + salary +
                ", số điện thoại : " + phoneNumber +
                '}';
    }
}
