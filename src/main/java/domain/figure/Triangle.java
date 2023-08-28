package domain.figure;

import domain.Point;

import java.util.ArrayList;
import java.util.List;

import static utils.TransformUtility.*;

public class Triangle implements Figure{
    public static final int TRIANGLE_SIZE = 3;
    private List<Point> points;

    public Triangle() {
        this.points = new ArrayList<>();
    }

    @Override
    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public void calculate() {
        double a = points.get(0).getDistance(points.get(1));
        double b = points.get(0).getDistance(points.get(2));
        double c = points.get(1).getDistance(points.get(2));

        double s = (a+b+c)/2;
        double result = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.printf("삼각형의 넓이는 %s", DoubleToString(result));
    }
}
