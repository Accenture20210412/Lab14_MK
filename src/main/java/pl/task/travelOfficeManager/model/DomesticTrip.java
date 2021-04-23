
package pl.task.travelOfficeManager.model;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
public class DomesticTrip extends Trip{

    private double discountDriveYourselfPercent;


    public DomesticTrip(LocalDate dateStart, LocalDate dateEnd, String locationDirection, double price,String name, double discountDriveYourself) {
        super(dateStart, dateEnd, locationDirection, price, name);
        this.discountDriveYourselfPercent = discountDriveYourself;
    }

    @Override
    public double getPrice() {
        if (discountDriveYourselfPercent>0) {
            return super.getPrice() * (discountDriveYourselfPercent / 100);
        }
        return super.getPrice();
    }


}
