package Opgave3;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //Creating students
        List<Integer> Lgrades = new ArrayList<>(List.of(00));
        Student2 Lucas = new Student2(1, "Lucas", Lgrades);

        List<Integer> Rgrades = new ArrayList<>(List.of(12));
        Rgrades.add(12);
        Student Remy = new Student(2, "Remy", Rgrades);

        List<Integer> Sgrades = new ArrayList<>(List.of(8));
        Student Zimmer = new Student(3, "Zimmer", Lgrades);

        List<Integer> Mgrades = new ArrayList<>(List.of(-12));
        Student Mathias = new Student(4, "Mathias", Lgrades);

        int result = Lucas.compare(Remy, Zimmer);
        System.out.println(result);



        //Creating collage
        //Collage eaaa = new Collage("Erhvervsakadimi Aarhus");

        //Add students
//        eaaa.addStudent(Lucas);
//        eaaa.addStudent(Remy);
//        eaaa.addStudent(Zimmer);
//        eaaa.addStudent(Mathias);

        //Finding student
        //System.out.println(eaaa.findStudent(2));

        System.out.println();

        //Calculation average of all grades
        //System.out.println(eaaa.getName() + "\n" + "Averge of all grades: " + eaaa.calcAverage());




    }
}
