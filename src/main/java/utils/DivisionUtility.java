package utils;

import domain.Coordinate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DivisionUtility {

    public static List<Coordinate> splitCoordinates(String input) {
        String[] dots = splitDots(input);
        List<Coordinate> coordinates = new ArrayList<>();
        for (String dot : dots) {
            coordinates.add(Coordinate.of(Stream.of(dot.split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray()));
        }
        return coordinates;
    }

    private static String[] splitDots(String input) {
        return input.replaceAll("[()]", "").split("-");
    }
}
