package figure;

import java.util.List;

public class Rectangle extends AbstractFigure{

    public static final int RECTAGLE_SIZE = 2;

    public Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    public int size() {
        return RECTAGLE_SIZE;
    }

    @Override
    public String getName() {
        return "사각형";
    }

    @Override
    public double area() {
        return 0;
    }
}
