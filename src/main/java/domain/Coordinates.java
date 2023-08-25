package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static constant.CoordinateNumber.*;

public class Coordinates {
    private List<Coordinate> coordinates;

    private Coordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public static Coordinates of(List<Coordinate> coordinates) {
        return new Coordinates(coordinates);
    }

    public int size() {
        return coordinates.size();
    }

    public Set<Double> calculateLineLength() {
        Set<Double> calculateResults = new HashSet<>();
        for (int i = 0; i < size(); i++) {
            double result = coordinates.get(i%size()).calculateLineLength(coordinates.get((i+1)%size()));
            calculateResults.add(result);
        }
        return calculateResults;
    }

    @Override
    public String toString() {
        String[] map = initMap();
        return makeMap(map, coordinates);
    }

    private String makeMap(String[] map, List<Coordinate> coordinates) {
        StringBuilder resultMap = new StringBuilder();
        for (int i = 0; i < coordinates.size(); i++) {
            Coordinate coordinate = coordinates.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(map[coordinate.getY()], 0, coordinate.getX() * 3 + 2)
                    .append("●").append(map[coordinate.getY()].substring(coordinate.getX() * 3 + 2));
            map[coordinate.getY()] = sb.toString();
        }
        for (int i = MAX_VALUE; i >= 0; i--) {
            resultMap.append(map[i]).append("\n");
        }
        return resultMap.toString();
    }

    private String[] initMap() {
        String[] map = new String[MAX_VALUE + 1];
        for (int i = MAX_VALUE; i > 0; i -= 2) {
            map[i] = String.format("%2d|                                                                           ", i);
        }
        for (int i = MAX_VALUE - 1; i > 0; i -= 2) {
            map[i] = "  |                                                                           ";
        }
        map[0] = "  +------------------------------------------------------------------------";
        return map;
    }
}
