package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

import static utils.DivisionUtility.*;

class CoordinateTest {

    @Test
    void calculateLineLength() {
        String input = "(10,10)-(14,15)";
        List<Coordinate> coordinates = splitCoordinates(input);

        Assertions.assertEquals(6.403124, coordinates.get(0).calculateLineLength(coordinates.get(1)), 0.000001);
    }
}