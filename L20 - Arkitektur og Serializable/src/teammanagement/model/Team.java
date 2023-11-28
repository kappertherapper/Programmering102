package teammanagement.model;

import java.awt.*;
import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Team: " + name;
    }
}

