package to;

public class Ellipse extends Figure {
    int a;
    int b;

    public Ellipse(int x, int y, int a, int b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    @Override
    double area() {
        return Math.PI * a * b;
    }

    @Override
    public String toString() {
        return super.toString() + "a = " + a + ", " + "b = " + b;
    }
}
