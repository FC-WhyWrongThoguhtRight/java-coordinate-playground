package domain;

public class Sonata extends Car {
    private final String name = "Sonata";
    private final Double distancePerLiter = 10d;
    private final Integer distance;

    public Sonata(Integer distance) {
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
