package architecture1stsem.storage;

import architecture1stsem.controller.Storage;
import architecture1stsem.model.Company;
import architecture1stsem.model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListStorage implements Storage {
    private static final ArrayList<Company> companies = new ArrayList<>();
    private static final ArrayList<Employee> employees = new ArrayList<>();

    // -------------------------------------------------------------------------

    @Override
    public List<Company> getCompanies() {
        return new ArrayList<>(companies);
    }

    @Override
    public void storeCompany(Company company) {
        companies.add(company);
    }

    @Override
    public void deleteCompany(Company company) {
        companies.remove(company);
    }

    // -------------------------------------------------------------------------

    @Override
    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    @Override
    public void storeEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        employees.remove(employee);
    }

    // -------------------------------------------------------------------------

    public static ListStorage loadStorage() {
        String fileName = "src/architecture1stsem/storage.ser";
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objIn = new ObjectInputStream(fileIn)
        ) {
            Object obj = objIn.readObject();
            ListStorage storage = (ListStorage) obj;
            System.out.println("ListStorage loaded from file " + fileName);
            return storage;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error deserializing storage");
            System.out.println(ex);
            return null;
        }
    }

    public static void saveStorage(Storage storage) {
        String fileName = "src/architecture1stsem/storage.ser";
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objOut = new ObjectOutputStream(fileOut)
        ) {
            objOut.writeObject(storage);
            System.out.println("ListStorage saved in file " + fileName);
        } catch (IOException ex) {
            System.out.println("Error serializing storage");
            System.out.println(ex);
            throw new RuntimeException();
        }
    }
}
