package teammanagement.gui;

import javafx.application.Application;
import teammanagement.controller.Controller;
import teammanagement.controller.Storage;
import teammanagement.model.Student;
import teammanagement.model.Team;
import teammanagement.storage.ListStorage;

public class TeamApp {

    public static void main(String[] args) {
        Storage storage = ListStorage.loadStorage();
        if (storage == null) {
            storage = new ListStorage();
            System.out.println("Empty ListStorage created");
        }
        Controller.setStorage(storage);

        if (Controller.getStudents().isEmpty()) {
            initStorage();
            System.out.println("Storage initialized");
        }

        Application.launch(TeamGui.class);

        ListStorage.saveStorage(storage);
    }

    public static void initStorage() {
        //Teams
        Team agf = Controller.createTeam("AGF");
        Team fck = Controller.createTeam("FCK");

        //Students
        Student ib = Controller.createStudent("Ib Ibsen", 20, true);
        Student jens = Controller.createStudent("Jens Jens", 30, false);

        Controller.addStudentToTeam(ib, agf);
        Controller.addStudentToTeam(jens, fck);
    }
}