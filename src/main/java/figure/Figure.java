package figure;

import Coordinate.Point;

import java.util.List;

public abstract class Figure {

    public abstract double getArea();

    public abstract List<Point> getPoints();

    @Override
    public abstract String toString();
}
