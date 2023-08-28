package domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FigureCreatorImpl implements FigureCreator {
    private static final Map<Integer, Figure> map = new HashMap<Integer, Figure>() {
        {
            put(2, new Line());
            put(3, new Triangle());
            put(4, new Square());
        }
    };

    @Override
    public Figure create(List<Point> points) {
        return map.get(points.size()).create(points);
    }
}
