package mission2;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void getResult() {
        List<Point> pointList = Arrays.asList(
                Point.of(10, 10),
                Point.of(14,15)
        );

        Figure a = new Line(pointList);

        //근사값 테스트
        assertThat(a.getResult()).isEqualTo(6.403124d, Offset.offset(0.00099));
    }
}