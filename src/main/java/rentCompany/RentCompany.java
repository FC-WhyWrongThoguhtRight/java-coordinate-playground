package rentCompany;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    List<Car> cars;

    public RentCompany() {
        this.cars = new ArrayList<>();
    }

    private static RentCompany rentCompany;

    public static RentCompany create() {
        if(rentCompany == null){
            rentCompany = new RentCompany();
        }
        return rentCompany;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String gererateReport() {

        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getName())
                    .append(" : ")
                    .append((int)car.getChargeQuantity())
                    .append("리터\r\n");
        }

        return sb.toString();
    }
}
