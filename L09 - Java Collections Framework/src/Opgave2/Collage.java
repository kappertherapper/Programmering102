package Opgave2;

import java.util.*;

public class Collage {
    private String name;
   private Map<Integer,Student> students = new LinkedHashMap<Integer, Student>();

    public Collage(String name) {
        this.name = name;
        this.students = new LinkedHashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.put(student.getStudentNo(), student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }
    public double calcAverage() {
        int totalSum = 0;
        int count = 0;
        for (int i = 0; i < students.size(); i++) {
            List<Integer> grades = students.get(i).getGrades();
            for (int j = 0; j < grades.size(); j++) {
                totalSum += grades.get(j);
                count++;
            }
        }

        return totalSum / count;
    }

    public Student findStudent(int studentNo) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getStudentNo() == studentNo) {
                return student;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }
}
