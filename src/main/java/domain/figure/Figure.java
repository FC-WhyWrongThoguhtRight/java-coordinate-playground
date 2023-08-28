package domain.figure;

import domain.Point;

import java.util.List;

public interface Figure {
    void calculate();

    void setPoints(List<Point> points);
}
