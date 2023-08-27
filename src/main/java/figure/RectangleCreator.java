package figure;

import java.util.List;

public class RectangleCreator implements FigureCreator{
    @Override
    public Figure create(List<Point> points) {
        if(points.size() == Rectangle.RECTANGLE_SIZE){
            return new Rectangle(points);
        }
        return null;
    }
}
