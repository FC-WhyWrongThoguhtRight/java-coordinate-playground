package mission2;

import java.util.List;

/**
 * https://brad903.tistory.com/entry/enum 블로그 참고
 */
public class FigureFactory implements FigureCreator{
    //1차 변경
    public static Figure getInstance(List<Point> points) {
        if(FigureType.LINE.matchNumOfPoint(points.size())){
            return new Line(points);
        }

        if(FigureType.TRIANGLE.matchNumOfPoint(points.size())){
            return new Triangle(points);
        }

        if(FigureType.SQUARE.matchNumOfPoint(points.size())){
            return new Square(points);
        }

        throw  new IllegalArgumentException("유효하지 않는 도형입니다.");
    }

    @Override
    public Figure create(List<Point> points) {
        return null;
    }
}
