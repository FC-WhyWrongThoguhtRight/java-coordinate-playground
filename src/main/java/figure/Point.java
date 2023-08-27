package figure;

import java.util.Objects;

public class Point{

    private final String ILLEGAL_COORDINATE = "좌표는 1부터 24까지만 입력 할 수 있습니다.";

    private final Integer x;
    private final Integer y;

    public Point(Integer x, Integer y) {
        this.x = x;
        if(x < 0 || x > 24){
            throw new IllegalArgumentException(ILLEGAL_COORDINATE);
        }
        this.y = y;
        if(y < 0 || y > 24){
            throw new IllegalArgumentException(ILLEGAL_COORDINATE);
        }
    }


    public double getDistance(Point p){
        int dx = p.minusX(x);
        int dy = p.minusY(y);
        return Math.sqrt(square(dx) + square(dy));
    }

    private static double square(int num) {
        return num * num ;
    }

    private int minusY(Integer y) {
        return this.y - y;
    }

    private int minusX(Integer x) {
        return this.x - x;
    }

    public static Point of(int x, int y){
        return new Point(x, y);
    }

    public static Point ofCommaSeparator(String s){
        String[] values = s.split(",");
        return new Point(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x) && Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
