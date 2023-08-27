package figure;

import java.util.Arrays;
import java.util.List;

public class FigureFactory {

    private static final List<FigureCreator> creators = Arrays.asList(
            new LineCreator(),
            new RectangleCreator(),
            new TriangleCreator()
    );



    public static Figure getInstance(List<Point> points){

        for (FigureCreator creator : creators) {
            Figure figure = creator.create(points);
            if(figure != null){
                return figure;
            }
        }

        throw new IllegalArgumentException("유효하지 않은 도형입니다.");

    }


}
