package controller;

import figure.Point;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InputSpliterTest {

    String s = "(10,10)-(14,15)";


    @Test
    void split() {
        String[] arr = InputSpliter.splitDash(s);
        assertThat(arr).isEqualTo(new String[]{"(10,10)","(14,15)"});
    }

    @Test
    void coordinate(){
        String[] arr = InputSpliter.splitDash(s);
        String actual = InputSpliter.getCoordinate(arr[0]);
        assertThat(actual).isEqualTo("10,10");
    }

    @Test
    void getPointList() {

        List<Point> expected = new ArrayList<>();
        expected.add(Point.of(10,10));
        expected.add(Point.of(14,15));

        assertThat(InputSpliter.getPointList(s)).isEqualTo(expected);

    }
}
