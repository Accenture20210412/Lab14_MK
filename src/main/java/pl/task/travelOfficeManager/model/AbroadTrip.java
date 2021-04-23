package pl.task.travelOfficeManager.model;

import java.time.LocalDate;

public class AbroadTrip extends Trip {

    private final double insurance;

    public AbroadTrip(LocalDate dateStart, LocalDate dateEnd, String locationDirection, double price, double insurance) {
        super(dateStart, dateEnd, locationDirection, price);
        this.insurance = insurance;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + insurance;
    }
}
