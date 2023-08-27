package figure;

import Coordinate.Point;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends Figure{
    private final Point point1;
    private final Point point2;
    private final Point point3;
    private final Point point4;


    public Rectangle(Point[] points) {
        this.point1 = points[0];
        this.point2 = points[1];
        this.point3 = points[2];
        this.point4 = points[3];
    }

    @Override
    public double getArea() {

        double width = point1.differenceX(point2);
        double height = point1.differenceY(point3);

        return width * height;
    }

    @Override
    public List<Point> getPoints() {
        List<Point> result = new ArrayList<>();
        result.add(point1);
        result.add(point2);
        result.add(point3);
        result.add(point4);
        return result;
    }

    @Override
    public String toString() {
        return "사각형 넓이는 " +
                getArea();
    }
}
