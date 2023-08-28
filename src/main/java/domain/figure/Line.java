package domain.figure;

import domain.Point;

import java.util.ArrayList;
import java.util.List;

import static utils.TransformUtility.*;

public class Line implements Figure {
    public static final int  LINE_SIZE = 2;
    private List<Point> points;

    public Line() {
        this.points = new ArrayList<>();
    }

    @Override
    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public void calculate() {
        double result = points.get(0).getDistance(points.get(1));
        System.out.printf("두 점 사이의 거리는 %s", DoubleToString(result));
    }
}
