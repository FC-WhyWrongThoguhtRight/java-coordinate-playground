package Coordinate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    void PointHasCoordinate() {
        Point x = new Point(10, 10);
        assertThat(x).isEqualTo(new Point(10, 10));
    }
}
