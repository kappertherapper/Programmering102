package teammanagement.storage;

import teammanagement.controller.Storage;
import teammanagement.model.Student;
import teammanagement.model.Team;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListStorage implements Storage, Serializable {
    private final List<Student> students = new ArrayList<>();
    private final List<Team> teams = new ArrayList<>();

    // -------------------------------------------------------------------------

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void storeStudent(Student student) {
        students.add(student);
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }

    // -------------------------------------------------------------------------

    @Override
    public List<Team> getTeams() {
        return new ArrayList<>(teams);
    }

    @Override
    public void storeTeam(Team team) {
        teams.add(team);
    }

    @Override
    public void deleteTeam(Team team) {
        teams.remove(team);
    }

    // -------------------------------------------------------------------------

    public static ListStorage loadStorage() {
        String fileName = "src/teammanagement/storage.ser";
        try (FileInputStream fileIn = new FileInputStream(fileName);
             ObjectInputStream objIn = new ObjectInputStream(fileIn)
        ) {
            Object obj = objIn.readObject();
            ListStorage storage = (ListStorage) obj;
            System.out.println("Storage loaded from file " + fileName);
            return storage;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error deserializing storage");
            System.out.println(ex);
            return null;
        }
    }

    public static void saveStorage(Storage storage) {
        String fileName = "src/teammanagement/storage.ser";
        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objOut = new ObjectOutputStream(fileOut)
        ) {
            objOut.writeObject(storage);
            System.out.println("Storage saved in file " + fileName);
        } catch (IOException ex) {
            System.out.println("Error serializing storage");
            System.out.println(ex);
            throw new RuntimeException();
        }
    }
}
