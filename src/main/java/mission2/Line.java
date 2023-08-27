package mission2;

import java.util.ArrayList;
import java.util.List;

public class Line implements Figure{
    public static final int LINE_POINT_SIZE = 2;

    private List<Point> points;

    public Line(List<Point> points) {
        this.points = points;
    }

    @Override
    public double getResult() {
        return Math.sqrt(points.get(0).getDistance(points.get(1)));
    }
}
