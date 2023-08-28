package domain;

public class Avante extends Car {
    private final String name = "Avante";
    private final Double distancePerLiter = 15d;
    private final Integer distance;

    public Avante(Integer distance) {
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return this.distancePerLiter;
    }

    @Override
    double getTripDistance() {
        return this.distance;
    }

    @Override
    String getName() {
        return this.name;
    }
}
