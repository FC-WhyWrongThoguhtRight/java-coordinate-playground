package mission2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Square implements Figure{
    public static final int SQUARE_POINT_SIZE = 4;
    private List<Point> points;

    public Square(List<Point> points) {
        this.points = points;
    }

    @Override
    public double getResult() {
        int X = 0;
        Point min = points.stream().min(Comparator.comparing(Point::getX)).get();

        for(Point point : points){
            if(point.getX() != min.getX() && point.getY() == min.getY()){
                X = Math.abs(point.getX() - min.getX());
            }
        }

        Point minY = points.stream().min(Comparator.comparing(Point::getY)).get();

        int Y = 0;

        for(Point point : points){
            if(point.getX() == minY.getX() && point.getY() != minY.getY()){
                Y = Math.abs(point.getY() - minY.getY());
            }
        }

        return (double)X*Y;
    }

}
