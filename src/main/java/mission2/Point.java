package mission2;

public class Point {
    public static final int SQUARE_ROOT = 2;
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point other) {
        int xDifference = other.minusX(x);
        int yDifference = other.minusY(y);
        return Math.sqrt(Math.pow(xDifference, SQUARE_ROOT) + Math.pow(yDifference, SQUARE_ROOT));
    }

    private int minusX(int number) {
        return this.x - number;
    }

    private int minusY(int number) {
        return this.y - number;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //of 메서드
    //여러 개의 인자를 받아 DTO 객체를 생성
    public static Point of(int x, int y) {
        return new Point(x, y);
    }
}
