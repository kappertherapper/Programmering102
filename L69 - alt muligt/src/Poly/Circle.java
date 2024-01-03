package Poly;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double caculateArea() {
        return 3.14 * radius * radius;
    }
}
