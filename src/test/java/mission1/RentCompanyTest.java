package mission1;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RentCompanyTest {

    @Test
    void addCar(){
        RentCompany company = new RentCompany();
        company.addCompany(new Sonata(500));
        company.addCompany(new Sonata(600));
        company.addCompany(new K5(100));
        company.addCompany(new Avante(200));
        company.addCompany(new K5(150));

        String report = company.generateReport();

        assertThat(report).isEqualTo("Sonata : 50 Sonata : 60 K5 : 7 Avante : 15 K5 : 11 ");
    }
}