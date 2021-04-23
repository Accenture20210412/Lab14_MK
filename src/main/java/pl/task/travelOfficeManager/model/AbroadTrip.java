package pl.task.travelOfficeManager.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AbroadTrip extends Trip {

    private double insurance;

    public AbroadTrip(LocalDate dateStart, LocalDate dateEnd, String locationDirection, double price, double insurance, String name) {
        super(dateStart, dateEnd, locationDirection, price,name);
        this.insurance = insurance;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + insurance;
    }
}
