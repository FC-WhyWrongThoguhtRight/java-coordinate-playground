package domain;

import exception.CustomException;
import exception.ErrorCode;

import java.util.*;

public class Triangle extends Figure {
    public Triangle(Point p1, Point p2, Point p3) {
        super(Arrays.asList(p1, p2, p3));
        if (!isValid()) {
            throw new CustomException(ErrorCode.NOT_VALID_REQUEST);
        }
        Collections.sort(points);
    }

    public Triangle(List<Point> points) {
        super(points);
        if (!isValid()) {
            throw new CustomException(ErrorCode.NOT_VALID_REQUEST);
        }
        Collections.sort(points);
    }

    public static Triangle create(List<Point> points) {
        return new Triangle(points);
    }

    public boolean isValid() {
        if (points.size() != 3) return false;
        Set<Integer> xSet = new HashSet<>();
        Set<Integer> ySet = new HashSet<>();
        for (Point point : points) {
            xSet.add(point.getX());
            ySet.add(point.getY());
        }
        return xSet.size() != 1 || ySet.size() != 1;
    }

    @Override
    public Double getArea() {
        Line a = new Line(points.get(0), points.get(1));
        Line b = new Line(points.get(0), points.get(2));
        Line c = new Line(points.get(1), points.get(2));

        Double aLen = a.getBetween();
        Double bLen = b.getBetween();
        Double cLen = c.getBetween();

        Double s = (aLen + bLen + cLen) / 2;

        return Math.sqrt(s * (s - aLen) * (s - bLen) * (s - cLen));
    }
}
