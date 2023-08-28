package domain.figure;

import domain.Point;

import java.util.ArrayList;
import java.util.List;

import static utils.TransformUtility.*;

public class Square implements Figure{
    public static final int  SQUARE_SIZE = 4;
    private List<Point> points;

    public Square() {
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
        double c = points.get(0).getDistance(points.get(3));

        double s = (a+b+c)/2;
        double result = Math.sqrt(s*(s-a)*(s-b)*(s-c))*2;

        System.out.printf("사각형의 넓이는 %s", DoubleToString(result));
    }
}
