package cz.steman.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        Employee employeeFromDb = new EmployeeDb("123", "John", "Smith", "john@smith");
        employees.add(employeeFromDb);

        EmployeeLdap employeeFromLdap = new EmployeeLdap("1234", "Jack", "Smith", "jack@smith");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));



        return employees;
    }
}
