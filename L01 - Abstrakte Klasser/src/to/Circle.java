package to;

public class Circle extends Figure{
    double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + "Radius = " + radius;
    }
}
