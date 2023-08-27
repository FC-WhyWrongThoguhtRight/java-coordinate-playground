package figure;

import Coordinate.Point;

public class Line {

    private final Point point1;
    private final Point point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }


    public double getDistance(){
        return Math.sqrt(Math.pow(point1.differenceX(point2), 2)
                +  Math.pow(point1.differenceY(point2), 2));
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }
}
