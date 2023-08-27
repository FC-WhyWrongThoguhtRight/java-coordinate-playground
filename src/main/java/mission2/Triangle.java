package mission2;

import java.util.ArrayList;
import java.util.List;

public class Triangle implements Figure{
    public static final int TRIANGLE_POINT_SIZE = 3;
    private List<Point> points;

    public Triangle(List<Point> points) {
        this.points = points;
    }

    @Override
    public double getResult() {
        double x = points.get(0).getDistance(points.get(1));
        double y = points.get(0).getDistance(points.get(2));
        double z = points.get(1).getDistance(points.get(2));

        double s = (x+y+z)/2.0;
        return Math.sqrt(s*(s-x)*(s-y)*(s-z));
    }
}
