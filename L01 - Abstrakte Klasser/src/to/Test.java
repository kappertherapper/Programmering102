package to;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(5, 7, 8);
        Square s = new Square(6, 8, 10);
        Ellipse e = new Ellipse(2, 1, 8,6);
        Rectangle r = new Rectangle(4, 6, 8, 8);

        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(c);
        figures.add(s);
        figures.add(e);
        figures.add(r);

        System.out.println("Figures before move");
        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }

        System.out.println();

        for (Figure figure : figures) {
            int move = 50;
            figure.y += move;
            figure.x += move;
        }

        System.out.println();

        System.out.println("Figures after move");
        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }
}
