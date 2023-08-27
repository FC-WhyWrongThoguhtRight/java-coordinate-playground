package figure;

import java.util.List;

public class Triangle extends AbstractFigure{
    
    public static final int TRIANGLE_SIZE = 3;

    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public int size() {
        return TRIANGLE_SIZE;
    }

    @Override
    public String getName() {
        return "삼각형";
    }

    @Override
    public double area() {

        Point p1 = getPoint(0);
        Point p2 = getPoint(1);
        Point p3 = getPoint(2);

        double a = p1.getDistance(p2);
        double b = p2.getDistance(p3);
        double c = p3.getDistance(p1);

        double s = (a + b + c) / 2;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String toString() {
        return "삼각형의 넓이는 " + area();
    }
}
