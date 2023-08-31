package to;

public class Rectangle extends Figure{
    int width;
    int height;

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }
    @Override
    public String toString() {
        return super.toString() + "Height = " + height + ", " + "Width = " + width;
    }
}
