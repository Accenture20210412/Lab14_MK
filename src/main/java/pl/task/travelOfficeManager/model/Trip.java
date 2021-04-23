package pl.task.travelOfficeManager.model;

import java.time.LocalDate;

public class Trip {


    private final LocalDate dateStart;
    private final LocalDate dateEnd;
    private final String locationDirection;
    private final double price;
    private String name;



    public Trip(LocalDate dateStart, LocalDate dateEnd, String locationDirection, double price) {
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.locationDirection = locationDirection;
        this.price = price;
    }

    public String getLocationDirection() {
        return locationDirection;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Trip start: " + dateStart + " and end: " + dateEnd +
                ". Trip to: " + locationDirection + ". Trip price= " + this.getPrice();
    }
}
