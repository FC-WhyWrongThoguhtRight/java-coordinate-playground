package Coordinate;

import java.util.Objects;

public class Y {
    private final int y;

    public Y(int y) {

        if(y > 24.0){
            throw new ArithmeticException("좌표는 24이하 여야 합니다.");
        }

        this.y = y;
    }

    public double difference(Y y) {
        return this.y - y.y;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Y y1 = (Y) o;
        return Objects.equals(y, y1.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(y);
    }
}
