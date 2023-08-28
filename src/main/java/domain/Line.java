package domain;

import exception.CustomException;
import exception.ErrorCode;

import java.util.Arrays;
import java.util.List;

public class Line extends Figure {
    public Line() {
        super(null);
    }

    public Line(Point p1, Point p2) {
        super(Arrays.asList(p1, p2));
    }

    public Line(List<Point> points) {
        super(points);
        if (!isValid()) {
            throw new CustomException(ErrorCode.NOT_VALID_REQUEST);
        }
    }

    public Line create(List<Point> points) {
        return new Line(points);
    }

    private boolean isValid() {
        return this.points.size() == 2;
    }

    @Override
    public Double getLengthOrArea() {
        Point p1 = points.get(0);
        Point p2 = points.get(1);

        Integer xDiff = p1.getX() - p2.getX();
        Integer yDiff = p1.getY() - p2.getY();

        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    @Override
    public String toString() {
        return "두 점 사이 거리는 " + Math.round(getLengthOrArea() * 1000000) / 1000000d;
    }
}
