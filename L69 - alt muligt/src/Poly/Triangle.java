package Poly;

public class Triangle extends Shape {
    double height;
    double baseline;

    public Triangle(double height, double baseline) {
        this.height = height;
        this.baseline = baseline;
    }

    @Override
    public double caculateArea() {
        return (height * baseline) / 2;
    }
}
