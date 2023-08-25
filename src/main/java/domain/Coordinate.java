package domain;

import static constant.ExceptionMessage.*;
import static utils.ValidateUtility.*;

public class Coordinate {
    private int x;
    private int y;

    private Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Coordinate of(int[] coordinate) {
        if (!validateLength(coordinate[0]) || !validateLength(coordinate[1])) {
            throw new IllegalArgumentException(OUT_OF_LENGTH);
        }
        return new Coordinate(coordinate[0], coordinate[1]);
    }

    public double calculateLineLength(Coordinate other) {
        return Math.sqrt((this.x - other.x) * (this.x - other.x) + (this.y - other.y) * (this.y - other.y));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordinate)) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
