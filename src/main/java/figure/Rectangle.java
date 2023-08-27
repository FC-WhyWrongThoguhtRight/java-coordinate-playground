package figure;

import java.util.List;

public class Rectangle extends AbstractFigure{

    public static final int RECTANGLE_SIZE = 4;

    public Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    public int size() {
        return RECTANGLE_SIZE;
    }

    @Override
    public String getName() {
        return "사각형";
    }

    @Override
    public double area() {
        Point p1 = getPoint(0);
        Point p2 = getPoint(0);
        Point p3 = getPoint(0);
        return p1.getDistance(p2) * p1.getDistance(p3);
    }

    @Override
    public String toString() {
        return "사각형의 넓이는 " + area();
    }

}
