package mission2;

import java.util.ArrayList;
import java.util.List;

public class Line extends AbstractFigure{
    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public double getResult() {
        return getPoints().get(0).getDistance(getPoints().get(1));
    }
}
