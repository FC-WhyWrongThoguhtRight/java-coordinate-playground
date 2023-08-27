package controller;

import Coordinate.Point;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InputSpliterTest {

    String s = "(10,10)-(14,15)";

    @Test
    void splitDash() {

        String[] arr = {"(10,10)","(14,15)"};
        String[] result = InputSpliter.splitDash(s);
        assertThat(result).isEqualTo(arr);
    }

    @Test
    void getCoordinateArray() {
        String[] arr1 = InputSpliter.splitDash(s);
        String[] coordinate = InputSpliter.getCoordinateArray(arr1[0]);
        assertThat(coordinate).isEqualTo(new String[]{"10", "10"});
    }


    @Test
    void StringsToPoint() {
        String[] arr1 = InputSpliter.splitDash(s);
        String[] coordinate = InputSpliter.getCoordinateArray(arr1[0]);
        Point p = InputSpliter.stringsToPoint(coordinate);
        assertThat(p).isEqualTo(new Point(10, 10));
    }


    @Test
    void getPoints() {
        Point[] p = InputSpliter.getPoints(s);
        Point[] expected = new Point[]{new Point(10, 10), new Point(14, 15)};
        assertThat(p).isEqualTo(expected);
    }
}
