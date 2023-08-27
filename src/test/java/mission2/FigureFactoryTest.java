package mission2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class FigureFactoryTest {

    @Test
    void line(){
        List<Point> pointList = Arrays.asList(
                Point.of(1, 2),
                Point.of(2,3)
        );

        assertThat(FigureFactory.getInstance(pointList)).isInstanceOf(Line.class);
    }

    @Test
    void 삼각형(){
        List<Point> pointList = Arrays.asList(
                Point.of(1, 2),
                Point.of(5,8),
                Point.of(4,3)
        );

        assertThat(FigureFactory.getInstance(pointList)).isInstanceOf(Triangle.class);
    }

    @Test
    void 사각형(){
        List<Point> pointList = Arrays.asList(
                Point.of(1, 1),
                Point.of(4, 1),
                Point.of(1, 4),
                Point.of(4, 4)
        );


        Point min = pointList.stream().min(Comparator.comparing(Point::getX)).get();
        int X = 0;

        for(Point point : pointList){
            if(point.getX() != min.getX() && point.getY() == min.getY()){
                X = Math.abs(point.getX() - min.getX());
            }
        }

        Point minY = pointList.stream().min(Comparator.comparing(Point::getY)).get();

        int Y = 0;

        for(Point point : pointList){
            if(point.getX() == min.getX() && point.getY() != min.getY()){
                Y = Math.abs(point.getY() - min.getY());
            }
        }

        assertThat(FigureFactory.getInstance(pointList)).isInstanceOf(Square.class);
    }
}
