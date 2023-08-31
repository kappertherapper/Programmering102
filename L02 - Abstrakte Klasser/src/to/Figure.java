package to;

public abstract class Figure {
    private int x;
    private int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract double area();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setParalel(int x, int y) {
        setX(getX() + x);
        setY(getY() + y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Placering: " + "(" + x +","+ y + ")," +
                                                 " Areal = " + area() + ", ";
    }
}
