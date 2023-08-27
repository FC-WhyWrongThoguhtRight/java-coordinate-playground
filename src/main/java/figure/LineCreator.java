package figure;

import java.util.List;

public class LineCreator implements FigureCreator{

    @Override
    public Figure create(List<Point> points) {
        if(points.size() == Line.LINE_SIZE){
            return new Line(points);
        }
        return null;
    }
}
