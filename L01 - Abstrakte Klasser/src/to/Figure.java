package to;

public abstract class Figure {
    int x;
    int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract double area();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Placering: " + "(" + x +","+ y + ")," +
                                                 " Areal = " + area() + ", ";
    }
}
