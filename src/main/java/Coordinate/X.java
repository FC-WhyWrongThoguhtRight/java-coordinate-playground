package Coordinate;

import java.util.Objects;

public class X {

    private final int x;

    public X(int x) {

        if(x > 24.0){
            throw new ArithmeticException("좌표는 24이하 여야 합니다.");
        }

        this.x = x;
    }
    public double difference(X x) {
        return this.x - x.x;
    }

    public int getX() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        X x1 = (X) o;
        return Objects.equals(x, x1.x);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }

}
