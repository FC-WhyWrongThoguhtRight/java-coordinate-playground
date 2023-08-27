package mission2;

import java.util.List;

public class FigureFactory {
    public static Figure getInstance(List<Point> points) {
        if(points.size() == Line.LINE_POINT_SIZE){
            return new Line(points);
        }

        if(points.size() == Triangle.TRIANGLE_POINT_SIZE){
            return new Triangle(points);
        }

        if(points.size() == Square.SQUARE_POINT_SIZE){
            return new Square(points);
        }

        throw  new IllegalArgumentException("유효하지 않는 도형입니다.");
    }
}
