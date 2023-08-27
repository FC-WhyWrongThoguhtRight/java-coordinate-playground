package coordinate.domain;

import java.util.ArrayList;
import java.util.List;

public class Coordinates {
    private List<Coordinate> coordinates = new ArrayList<>();

    public Coordinates(String coordinatesStr) {
        String[] coordinateStrArr = coordinatesStr.split("-");
        for (String coordinateStr : coordinateStrArr) {
            Coordinate coordinate = new Coordinate(coordinateStr);
            coordinates.add(coordinate);
        }
    }

    public Coordinates(List<Coordinate> coordinates) {
        this.coordinates = coordinates;
    }

    public double calculateLength() {
        Coordinate coor1 = coordinates.get(0);
        Coordinate coor2 = coordinates.get(1);

        return Math.sqrt(
                Math.pow(coor1.getY() - coor2.getY(), 2.0)
                        + Math.pow(coor1.getX() - coor2.getX(), 2.0)
        );
    }

    public boolean hasCoordinateAt(int x, int y) {
        return coordinates.stream()
                .anyMatch(coordinate -> coordinate.getY() == y && coordinate.getX() == x);
    }
}