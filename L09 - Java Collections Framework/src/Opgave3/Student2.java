package Opgave3;

import java.util.*;

public class Student2 implements Comparator<Student> {
    private int StudentNo;
    private String name;
    private List<Integer> grades = new ArrayList<>();

    public Student2(int studentNo, String name, List<Integer> grades) {
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

    public void addGrade(int Grade) {
        grades.add(Grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "No: " + StudentNo + "\n" +
                "Name: " + name + "\n" +
                "Grades: " + grades;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getName().length() > o2.getName().length()) ? o1.getName().length() : o2.getName().length();
    }
}

