package mission2;

import java.util.List;
import java.util.Objects;

//추상클래스 생성
//공통 요소
public abstract class AbstractFigure implements Figure{
    private final List<Point> points;

    protected AbstractFigure(List<Point> points) {
        if (points == null || points.isEmpty()) {
            throw new IllegalArgumentException("올바른 값이 아닙니다.");
        }
        this.points = points;
    }

    @Override
    public List<Point> getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractFigure that = (AbstractFigure) o;
        return Objects.equals(points, that.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
