package rentCompany;

public class Sonata extends Car {
    public Sonata(int i) {
        super(i);
        distancePerLiter = 10;
        name = "Sonata";
    }

    @Override
    double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return name;
    }
}
