package figure;

import Coordinate.Point;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends Figure{

    Point point1;
    Point point2;
    Point point3;

    public Triangle(Point[] points) {
        point1 = points[0];
        point2 = points[1];
        point3 = points[2];
    }

    @Override
    public double getArea() {

        Line l1 = new Line(new Point[]{point1, point2});
        Line l2 = new Line(new Point[]{point2, point3});
        Line l3 = new Line(new Point[]{point3, point1});

        double a = l1.getArea();
        double b = l2.getArea();
        double c = l3.getArea();
        double s = (a + b + c) / 2;

        return Math.sqrt(s * ( s - a ) * (s - b) * (s - c));
    }

    @Override
    public List<Point> getPoints() {
        List<Point> result = new ArrayList<>();
        result.add(point1);
        result.add(point2);
        result.add(point3);
        return result;
    }

    @Override
    public String toString() {
        return "삼각형 넓이는 " +
                getArea();
    }
}
