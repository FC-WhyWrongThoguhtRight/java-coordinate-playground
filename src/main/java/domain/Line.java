package domain;

import exception.CustomException;
import exception.ErrorCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Line {
    List<Point> points;

    public Line(Point p1, Point p2) {
        this.points = new ArrayList<>(Arrays.asList(p1, p2));
    }

    public Line(List<Point> points) {
        this.points = points;
        if (!isValid()) {
            throw new CustomException(ErrorCode.NOT_VALID_REQUEST);
        }
    }

    public static Line create(List<Point> points) {
        return new Line(points);
    }

    private boolean isValid() {
        return this.points.size() == 2;
    }

    public Double getBetween() {
        Point p1 = points.get(0);
        Point p2 = points.get(1);

        Integer xDiff = p1.getX() - p2.getX();
        Integer yDiff = p1.getY() - p2.getY();

        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
