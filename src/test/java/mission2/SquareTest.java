package mission2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void getResult() {
        List<Point> pointList = Arrays.asList(
                Point.of(10, 10),
                Point.of(22, 10),
                Point.of(22, 18),
                Point.of(10, 18)
        );
        Figure f = new Square(pointList);
        assertThat(f.getResult()).isEqualTo(96d);
    }
}