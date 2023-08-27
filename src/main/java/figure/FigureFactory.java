package figure;

import java.util.List;

public abstract class FigureFactory {



    public static Figure getInstance(List<Point> points){


        if (points.size() == Line.LINE_SIZE) {
            return new Line(points);
        }

        if (points.size() == Triangle.TRIANGLE_SIZE) {
            return new Triangle(points);
        }

        if (points.size() == Rectangle.RECTANGLE_SIZE) {
            return new Rectangle(points);
        }

        throw new IllegalArgumentException("유효하지 않은 도형입니다.");

    }


}
