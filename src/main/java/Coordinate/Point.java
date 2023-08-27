package Coordinate;

import java.util.Objects;

public class Point {

    private final X x;
    private final Y y;
    public Point(int x, int y) {
        this.x = new X(x);
        this.y = new Y(y);
    }

    public Point(String x, String y) {
        this(Integer.parseInt(x), Integer.parseInt(y));
    }

    public double differenceX(Point point){
        return x.difference(point.x);
    }

    public double differenceY(Point point){
        return y.difference(point.y);
    }

    public int getX() {
        return x.getX();
    }

    public int getY() {
        return y.getY();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x) && Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
