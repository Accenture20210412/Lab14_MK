
package pl.task.travelOfficeManager.model;
import java.time.LocalDate;

public class DomesticTrip extends Trip{

    private final double discountDriveYourselfPercent;


    public DomesticTrip(LocalDate dateStart, LocalDate dateEnd, String locationDirection, double price, double discountDriveYourself) {
        super(dateStart, dateEnd, locationDirection, price);
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
