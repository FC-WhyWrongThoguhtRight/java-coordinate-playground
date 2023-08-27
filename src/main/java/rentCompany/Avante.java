package rentCompany;

public class Avante extends Car {
    public Avante(int i) {
        super(i);
        distancePerLiter = 15;
        name = "Avante";
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
