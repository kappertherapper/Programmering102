package to;

public class Square extends Figure{
    int length;

    public Square(int x, int y, int length) {
        super(x, y);
        this.length = length;
    }

    @Override
    double area() {
        return length * 4;
    }

    @Override
    public String toString() {
        return super.toString() + "Length = " + length;
    }
}
