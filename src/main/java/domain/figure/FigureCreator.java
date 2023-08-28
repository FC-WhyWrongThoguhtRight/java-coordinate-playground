package domain.figure;

import domain.Point;

import java.util.List;

public interface FigureCreator {
    Figure create(List<Point> points);
}
