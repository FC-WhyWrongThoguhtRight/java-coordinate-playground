package mission2;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getResult() {
        List<Point> pointList = Arrays.asList(
                Point.of(10, 10),
                Point.of(14,15),
                Point.of(20,8)
        );
        Figure f = new Triangle(pointList);
        assertThat(f.getResult()).isEqualTo(29.0, Offset.offset(0.09));
    }
}