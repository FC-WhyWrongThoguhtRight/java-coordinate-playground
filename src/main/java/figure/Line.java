package figure;

import Coordinate.Point;

import java.util.ArrayList;
import java.util.List;

public class Line extends Figure {

    private final Point point1;
    private final Point point2;

    public Line(Point[] points) {
        this.point1 = points[0];
        this.point2 = points[1];
    }


    public double getArea(){
        return Math.sqrt(Math.pow(point1.differenceX(point2), 2)
                +  Math.pow(point1.differenceY(point2), 2));
    }

    @Override
    public List<Point> getPoints() {
        List<Point> result = new ArrayList<>();
        result.add(point1);
        result.add(point2);
        return result;
    }

    @Override
    public String toString() {
        return "두 점 사이 거리는 " +
                getArea();
    }


}
