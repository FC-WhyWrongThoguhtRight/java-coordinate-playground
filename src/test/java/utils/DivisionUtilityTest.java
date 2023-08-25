package utils;

import domain.Coordinate;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static utils.DivisionUtility.*;

public class DivisionUtilityTest {

    @Test
    void 좌표_분리_테스트() {
        String input = "(10,10)-(12,14)";
        List<Coordinate> coordinates = splitCoordinates(input);

        assertEquals(coordinates.get(0), Coordinate.of(new int[]{10, 10}));
        assertEquals(coordinates.get(1), Coordinate.of(new int[]{12, 14}));
    }
}
