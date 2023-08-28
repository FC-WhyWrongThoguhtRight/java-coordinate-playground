package domain;

import exception.CustomException;
import exception.ErrorCode;

public class Point implements Comparable<Point> {
    private static final Integer MIN_X = 0;
    private static final Integer MAX_X = 25;
    private static final Integer MIN_Y = 0;
    private static final Integer MAX_Y = 25;

    private final Integer x, y;

    public Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
        if(!isValid()) {
            throw new CustomException(ErrorCode.NOT_VALID_REQUEST);
        }
    }

    public boolean isValid() {
        return this.x >= MIN_X && this.x < MAX_X && this.y >= MIN_Y && this.y < MAX_Y;
    }

    public Integer getX() {
        return this.x;
    }

    public Integer getY() {
        return this.y;
    }

    @Override
    public int compareTo(Point p) {
        if (this.x == p.x) {
            return Integer.compare(this.y, p.y);
        }
        return Integer.compare(this.x, p.x);
    }
}
