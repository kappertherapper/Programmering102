package Poly;

public class Demo {
    public static void main(String[] args) {
        Circle c = new Circle(4);
        Rectangle r = new Rectangle(10,15);
        Triangle t = new Triangle(6, 10);

        String area = "Area of ";

        System.out.println(area + "Circle: " + c.caculateArea());
        System.out.println(area + "Rectangle: " + r.caculateArea());
        System.out.println(area + "Triangle: " + t.caculateArea());

    }
}
