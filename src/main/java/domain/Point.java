package domain;

public class Point {
    private final int x;
    private final int y;

    private Point(int x, int y) {
        this.x = x;
        if (x < 0 || x > 24) {
            throw new IllegalArgumentException();
        }

        this.y = y;
        if (y < 0 || y > 24) {
            throw new IllegalArgumentException();
        }
    }

    public double getDistance(Point other) {
        int dx = other.x - x;
        int dy = other.y - y;
        return Math.sqrt(dx*dx + dy*dy);
    }

    public static Point ofCommaSeparator(String in) {
        String[] values = in.split(",");
        return new Point(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
    }
}
