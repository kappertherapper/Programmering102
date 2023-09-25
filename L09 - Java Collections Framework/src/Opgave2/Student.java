package Opgave2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    int StudentNo;
    String name;
    List<Integer> grades = new ArrayList<>();

    public Student(int studentNo, String name, List<Integer> grades) {
        StudentNo = studentNo;
        this.name = name;
        this.grades = grades;
    }

    public int getStudentNo() {
        return StudentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(int Grade){
        grades.add(Grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return  "No: " + StudentNo + "\n" +
                "Name: " + name + "\n" +
                "Grades: " + grades;
    }
}
