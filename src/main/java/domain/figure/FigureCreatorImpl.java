package domain.figure;

import domain.Point;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureCreatorImpl implements FigureCreator {
    static Map<Integer, Figure> creators = new HashMap<>();
    static {
        creators.put(Line.LINE_SIZE, new Line());
        creators.put(Square.SQUARE_SIZE, new Square());
        creators.put(Triangle.TRIANGLE_SIZE, new Triangle());
    }

    @Override
    public Figure create(List<Point> points) {
        Figure figure = creators.get(points.size());
        figure.setPoints(points);
        return figure;
    }
}
