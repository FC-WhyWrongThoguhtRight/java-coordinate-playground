package domain;

import java.util.ArrayList;
import java.util.List;

public class RentCompany implements ChargeCalculator {
    private static final String NEWLINE = System.getProperty("line.separator");

    List<Car> carList = new ArrayList<>();

    public void addCar(Car car) {
        carList.add(car);
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for (Car car : carList) {
            sb.append(car.getName())
                    .append(" : ")
                    .append(Math.round(getChargeQuantity(car)))
                    .append("리터")
                    .append(NEWLINE);
        }
        return sb.toString();
    }
}
