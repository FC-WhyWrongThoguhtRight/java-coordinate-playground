package figure;

import java.util.List;

public class TriangleCreator implements FigureCreator{
    @Override
    public Figure create(List<Point> points) {
        if(points.size() == Triangle.TRIANGLE_SIZE){
            return new Triangle(points);
        }
        return null;
    }
}
