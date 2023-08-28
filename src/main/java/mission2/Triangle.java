package mission2;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends AbstractFigure{

    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public double getResult() {
        double x = getPoints().get(0).getDistance(getPoints().get(1));
        double y = getPoints().get(0).getDistance(getPoints().get(2));
        double z = getPoints().get(1).getDistance(getPoints().get(2));

        double s = (x+y+z)/2.0;
        return Math.sqrt(s*(s-x)*(s-y)*(s-z));
    }
}
