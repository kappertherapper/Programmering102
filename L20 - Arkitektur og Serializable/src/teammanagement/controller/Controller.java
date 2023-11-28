package teammanagement.controller;

import teammanagement.gui.Observer;
import teammanagement.model.Student;
import teammanagement.model.Team;

import java.util.ArrayList;
import java.util.List;

public abstract class Controller {
    private static Storage storage;

    public static void setStorage(Storage storage) {
        Controller.storage = storage;
    }

    //-----------------------------------------------------

    /**
     * Create a new Student.
     * Pre: name not empty, age >= 0.
     */
    public static Student createStudent(String name, int age, boolean active) {
        Student student = new Student(name, age, active);
        storage.storeStudent(student);
        notifyObservers();
        return student;
    }

    /** Delete the student. */
    public static void deleteStudent(Student student) {
        storage.deleteStudent(student);
        notifyObservers();
    }

    /**
     * Update the student.
     * Pre: name not empty, age >= 0.
     */
    public static void updateStudent(Student student, String name, int age, boolean active) {
        student.setName(name);
        student.setAge(age);
        student.setActive(active);
    }

    public static void addStudentToTeam(Student student, Team team) {
        team.addStudent(student);
    }

    //-----------------------------------------------------

    public static List<Student> getStudents() {
        return storage.getStudents();
    }

    //-----------------------------------------------------


    /**
     * Create a new Team.
     * Pre: name not empty
     */
    public static Team createTeam(String name) {
        Team team = new Team(name);
        storage.storeTeam(team);
        notifyObservers();
        return team;
    }

    /** Delete the Team. */
    public static void deleteTeam(Team team) {
        storage.deleteTeam(team);
        notifyObservers();
    }

    /**
     * Update the Team.
     * Pre: name not empty,
     */
    public static void updateTeam(Team team, String name) {
        team.setName(name);

    }

    /**
     * Returns teamMembers of the wished team
     * Pre: Team not null
     */
    public static List<Student> getTeamMembers(Team team) {
        List<Student> teamMembers = new ArrayList<>();
        for (Student student : getStudents()) {
            if (student.getTeam().equals(team))
                teamMembers.add(student);
        }
        return teamMembers;
    }

    //-----------------------------------------------------

    public static List<Team> getTeams() {
        return storage.getTeams();
    }

    //-----------------------------------------------------

    private static final List<Observer> observers = new ArrayList<>();

    public static void addObserver(Observer observer) {
        observers.add(observer);
    }

    private static void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
