package architecture1stsem.gui;

import architecture1stsem.controller.Controller;
import architecture1stsem.model.Company;
import architecture1stsem.model.Employee;
import architecture1stsem.storage.ListStorage;
import architecture1stsem.controller.Storage;
import javafx.application.Application;


public class ArchitectureApp {

    public static void main(String[] args) {
        Storage storage = ListStorage.loadStorage();
        if (storage == null) {
            storage = new ListStorage();
            System.out.println("Empty ListStorage created");
        }
        Controller.setStorage(storage);

        if (Controller.getCompanies().isEmpty() || Controller.getEmployees().isEmpty()) {
            initStorage();
            System.out.println("ListStorage initialized");
        }
        initStorage();
        Application.launch(ArchitectureGui.class);
        ListStorage.saveStorage(storage);
    }

    public static void initStorage() {
        Company ibm = Controller.createCompany("IBM", 37);
        Company amd = Controller.createCompany("AMD", 40);
        Company sled = Controller.createCompany("SLED", 45);
        Controller.createCompany("Vector", 32);

        Employee bob = Controller.createEmployee("Bob Dole", 210);
        Controller.addEmployeeToCompany(bob, ibm);

        Employee alice = Controller.createEmployee("Alice Schmidt", 250);
        Controller.addEmployeeToCompany(alice, ibm);

        Employee george = Controller.createEmployee("George Down", 150);
        Controller.addEmployeeToCompany(george, amd);

        Employee rita = Controller.createEmployee("Rita Uphill", 300);
        Controller.addEmployeeToCompany(rita, sled);

        Controller.createEmployee("John Doe", 100);
    }
}
