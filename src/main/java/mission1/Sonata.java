package mission1;

public class Sonata implements Car{
    public static final int FUEL_EFFICIENCY = 10;
    private int distance;

    public Sonata(int distance) {
        this.distance = distance;
    }

    @Override
    public int sumLiter(){
        return this.distance/FUEL_EFFICIENCY;
    }

    @Override
    public String toString() {
        return "Sonata : " + sumLiter();
    }
}
