package teammanagement.controller;

import teammanagement.model.Student;
import teammanagement.model.Team;

import java.util.List;

public interface Storage {
    List<Student> getStudents();
    void storeStudent(Student student);
    void deleteStudent(Student student);
    List<Team> getTeams();
    void storeTeam(Team team);
    void deleteTeam(Team team);
}
