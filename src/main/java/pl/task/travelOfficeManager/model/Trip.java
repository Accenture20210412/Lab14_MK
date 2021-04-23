package pl.task.travelOfficeManager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Trip {


    private LocalDate dateStart;
    private LocalDate dateEnd;
    private String locationDirection;
    private double price;
    private String name;


    @Override
    public String toString() {
        return "Trip start: " + dateStart + " and end: " + dateEnd +
                ". Trip to: " + locationDirection + ". Trip price= " + this.getPrice();
    }
}
