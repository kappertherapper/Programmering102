package architecture1stsem.controller;

import architecture1stsem.model.Company;
import architecture1stsem.model.Employee;

import java.util.List;

public interface Storage {

    //Company
    List<Company> getCompanies();
    void storeCompany(Company company);
    void deleteCompany(Company company);

    //Employee
    List<Employee> getEmployees();
    void storeEmployee(Employee employee);
    void deleteEmployee(Employee employee);

}
