package mission1;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {
    private List<Car> cars = new ArrayList<>();

    public void addCompany(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();

        for(Car car : cars){
            sb.append(car.toString() + " ");
        }

        return sb.toString();
    }
}
