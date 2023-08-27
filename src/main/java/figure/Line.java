package figure;

import java.util.List;

public class Line extends AbstractFigure{

    public static final int LINE_SIZE = 2;

    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public int size() {
        return LINE_SIZE;
    }

    @Override
    public String getName() {
        return "선";
    }

    @Override
    public double area() {
        Point p1 = getPoint(0);
        Point p2 = getPoint(1);
        return p1.getDistance(p2);
    }

    @Override
    public String toString() {
        return "두 점 사이의 거리는 " + area();
    }
}
