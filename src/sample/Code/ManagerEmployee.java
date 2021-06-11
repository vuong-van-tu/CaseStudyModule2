package sample.Code;

import sample.Code.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ManagerEmployee {
    private List<Employee> listEmployee = null;

    public ManagerEmployee() {
        listEmployee = new ArrayList<>();
    }

    public List<Employee> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(List<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }

    public void add(Employee employee) {
        listEmployee.add(employee);
    }

    public void display() {
        for (Employee nv : listEmployee) {
                System.out.println(nv);
        }
    }

    public void edit(String id, Employee employee) {
        int index = listEmployee.indexOf(findById(id));
        for (Employee e : listEmployee) {
            if (findById(id).equals(e.getId())) {
                listEmployee.set(index, employee);
            } else {
                System.out.println("Không tìm thấy nhân viên");
            }
        }
    }

    public List<Employee> findById(String id) {
        List<Employee> listId = new ArrayList<Employee>();
        int count = 0;
        for (Employee employee : listEmployee) {
            if (employee.getId().equals(id)) {
                listId.add(employee);
                count++;
            }
        }
        if (count != 0) {
            return listId;
        } else {
            return null;
        }
    }

    public int checkEmployeeIndex(String id) {
        for (int i = 0; i < listEmployee.size(); i++) {
            if (listEmployee.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public void delete(String id) {
        int findIndex = checkEmployeeIndex(id);
        if (findIndex == -1) {
            System.out.println("Employee not found");
        } else {
            listEmployee.remove(findIndex);
        }
    }

    public void sortByName() {
        Collections.sort(listEmployee, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.getName().compareTo(o2.getName()) == 0) {
                    return (int) (o1.getSalary() - o2.getSalary());
                } else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        List<Employee> sortByName = new ArrayList<Employee>();
        for (Employee employee : listEmployee) {
            sortByName.add(employee);
        }
        listEmployee = sortByName;
    }
}
