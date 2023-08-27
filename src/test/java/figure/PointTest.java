package figure;

import figure.Point;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {


    @Test
    void Point는값이있는가() {
        Point p = Point.ofCommaSeparator("10,10");
        assertThat(p).isEqualTo(new Point(10,10));
    }


}
