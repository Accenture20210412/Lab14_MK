package pl.task.travelOfficeManager.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private String name;
    private String surname;
    private String adressC;
    private Trip tripCustomer;
    private int idCustomer;

    @Override
    public String toString() {
        if (tripCustomer == null) {
            return "Mr/Mrs " + name + " " + surname +
                    ". Live in " + adressC + ". Doesnt choose a trip. " + "\n";
        }
        return "Mr/Mrs " + name + " " + surname +
                ". Live in " + adressC + tripCustomer.toString() + ".\n";

    }
}
