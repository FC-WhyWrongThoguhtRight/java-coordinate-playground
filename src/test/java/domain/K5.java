package domain;

public class K5 extends Car {
    private final String name = "K5";
    private final Double distancePerLiter = 13d;
    private final Integer distance;

    public K5(Integer distance) {
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
