package rentCompany;

public abstract class Car {

    String name;
    int tripDistance;
    int distancePerLiter;

    public Car(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    abstract double getDistancePerLiter();
    abstract double getTripDistance();
    abstract String getName();

    double getChargeQuantity(){
        return getTripDistance() / getDistancePerLiter();
    }

}
