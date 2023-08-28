package mission2;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Square implements Figure{
    private List<Point> points;

    public Square(List<Point> points) {
        this.points = points;
    }

    @Override
    public double getResult() {
        return (double)getDistanceX()*getDistanceY();
    }

    private int getDistanceY() {
        Point minY = getMinPoint(Point::getY);
        Point maxY = getMaxPoint(Point::getY);

        return Math.abs(maxY.getY() - minY.getY());
    }

    private int getDistanceX() {
        Point min = getMaxPoint(Point::getX);
        Point max = getMinPoint(Point::getX);

        return Math.abs(max.getX() - min.getX());
    }

    private Point getMinPoint(Function<Point, Integer> function) {
        return points.stream().min(Comparator.comparing(function)).get();
    }

    private Point getMaxPoint(Function<Point, Integer> function) {
        return points.stream().max(Comparator.comparing(function)).get();
    }


}
