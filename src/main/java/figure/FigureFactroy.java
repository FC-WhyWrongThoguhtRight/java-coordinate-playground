package figure;

import Coordinate.Point;

public class FigureFactroy {
    public static Figure create(Point[] points) {

        if (points.length == 2) {
            return new Line(points);
        } else if (points.length == 3) {
            return new Triangle(points);
        } else if (points.length == 4) {
            return new Rectangle(points);
        }

        return null;
    }
}
