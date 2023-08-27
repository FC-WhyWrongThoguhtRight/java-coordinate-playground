package rentCompany;

public class K5 extends Car {
    public K5(int i) {
        super(i);
        distancePerLiter = 13;
        name = "K5";
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
