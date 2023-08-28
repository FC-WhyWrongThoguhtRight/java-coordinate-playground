package domain;

public interface ChargeCalculator {
    /**
     * 주입해야할 연료량을 구한다.
     */
    default double getChargeQuantity(Car car) {
        return car.getTripDistance() / car.getDistancePerLiter();
    }
}
