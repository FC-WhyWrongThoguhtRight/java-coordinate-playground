package mission1;

public class Avante implements Car {
    public static final int FUEL_EFFICIENCY = 13;
    private int distance;
    public Avante(int distance) {
        this.distance = distance;
    }

    @Override
    public int sumLiter(){
        return this.distance/FUEL_EFFICIENCY;
    }

    @Override
    public String toString() {
        return "Avante : " + sumLiter();
    }
}
