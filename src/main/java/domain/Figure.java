package domain;

import java.util.List;

public abstract class Figure {
    protected final List<Point> points;

    protected Figure(List<Point> points) {
        this.points = points;
    }

    abstract Double getArea();
}
