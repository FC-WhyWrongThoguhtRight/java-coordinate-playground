package domain;

import exception.CustomException;
import exception.ErrorCode;

import java.util.*;

public class Square extends Figure {
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(Arrays.asList(p1, p2, p3, p4));
        if (!isValid()) {
            throw new CustomException(ErrorCode.NOT_VALID_REQUEST);
        }
        Collections.sort(points);
    }

    public Square(List<Point> points) {
        super(points);
        if (!isValid()) {
            throw new CustomException(ErrorCode.NOT_VALID_REQUEST);
        }
        Collections.sort(points);
    }

    public static Square create(List<Point> points) {
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
    public Double getArea() {
        Line height = new Line(points.get(0), points.get(1));
        Line width = new Line(points.get(0), points.get(2));
        return height.getBetween() * width.getBetween();
    }
}
