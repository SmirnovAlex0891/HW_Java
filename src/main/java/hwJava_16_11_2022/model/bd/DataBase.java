package hwJava_16_11_2022.model.bd;


import hwJava_16_11_2022.model.Employees;

import java.util.LinkedList;
import java.util.List;

public class DataBase {
    List<Employees> employeesList = new LinkedList<>();

    public void addEmployee(Employees employee) {
        employeesList.add(employee);
    }
    public int getListSize() {
        return employeesList.size();
    }
    public void showEmployees() {
        for (int i = 0; i < employeesList.size(); i++) {
            System.out.print("Employee: ");
            employeesList.get(i).show();
        }
    }
}
