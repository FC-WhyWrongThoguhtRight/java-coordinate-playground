package mission2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://brad903.tistory.com/entry/enum 블로그 참고
 * 1. Enum 으로 상수 구현
 * 2. Map 을 이용한 IF 중첩제거
 * 3. 람다를 이용한 단순화
 */
public class FigureFactory{
    public static final String ERROR_MESSAGE_VALID = "유효하지 않는 도형입니다.";
    //중첩 if >> map 을 이용 리팩토링
    private static Map<Integer, FigureCreator> figures = new HashMap<>();

    //람다를 이용한 static 블록 활용
    static {
        figures.put(FigureType.LINE.getNumOfPoint(), points -> new Line(points));
        figures.put(FigureType.SQUARE.getNumOfPoint(), points -> new Square(points));
        figures.put(FigureType.TRIANGLE.getNumOfPoint(), points -> new Triangle(points));
    }

    //enum 을 이용한 1차 리팩토링
    public static Figure getInstance(List<Point> points) {
        if(points == null){
            throw new NullPointerException();
        }

        if(isValid(points)){
            throw  new IllegalArgumentException(ERROR_MESSAGE_VALID);
        }

        return figures.get(points.size()).create(points);
    }

    private static boolean isValid(List<Point> points) {
        return points.size() < FigureType.LINE.getNumOfPoint() || points.size() > FigureType.SQUARE.getNumOfPoint();
    }

}
