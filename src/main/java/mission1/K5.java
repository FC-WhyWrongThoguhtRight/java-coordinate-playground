package mission1;

public class K5 implements Car {
    public static final int FUEL_EFFICIENCY = 13;
    private int distance;
    public K5(int distance) {
        this.distance = distance;
    }

    @Override
    public int sumLiter(){
        return this.distance/FUEL_EFFICIENCY;
    }

    @Override
    public String toString() {
        return "K5 : " + sumLiter();
    }
}
