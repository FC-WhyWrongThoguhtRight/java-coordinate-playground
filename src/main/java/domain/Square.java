package domain;

import exception.CustomException;
import exception.ErrorCode;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Square extends Figure {
    protected Square() {
        super(null);
    }

    public Square(List<Point> points) {
        super(points);
        if (!isValid()) {
            throw new CustomException(ErrorCode.NOT_VALID_REQUEST);
        }
        Collections.sort(points);
    }

    public Square create(List<Point> points) {
        return new Square(points);
    }

    public boolean isValid() {
        if (points.size() != 4) return false;
        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();
        for (Point point : points) {
            xSet.add(point.getX());
            ySet.add(point.getY());
        }
        return xSet.size() == 2 && ySet.size() == 2;
    }

    @Override
    public Double getLengthOrArea() {
        Line height = new Line(points.get(0), points.get(1));
        Line width = new Line(points.get(0), points.get(2));
        return height.getLengthOrArea() * width.getLengthOrArea();
    }

    @Override
    public String toString() {
        return "사각형 넓이는 " + Math.round(getLengthOrArea());
    }
}
