package domain;

import exception.CustomException;
import exception.ErrorCode;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Triangle extends Figure {
    protected Triangle() {
        super(null);
    }

    public Triangle(List<Point> points) {
        super(points);
        if (!isValid()) {
            throw new CustomException(ErrorCode.NOT_VALID_REQUEST);
        }
        Collections.sort(points);
    }

    public Triangle create(List<Point> points) {
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
    public Double getLengthOrArea() {
        Line a = new Line(points.get(0), points.get(1));
        Line b = new Line(points.get(0), points.get(2));
        Line c = new Line(points.get(1), points.get(2));

        Double aLen = a.getLengthOrArea();
        Double bLen = b.getLengthOrArea();
        Double cLen = c.getLengthOrArea();

        Double s = (aLen + bLen + cLen) / 2;

        return Math.sqrt(s * (s - aLen) * (s - bLen) * (s - cLen));
    }

    @Override
    public String toString() {
        return "삼각형 넓이는 " + Math.round(getLengthOrArea() * 10) / 10d;
    }
}
