package pl.task.travelOfficeManager.model;
public class Customer {
    private final String name;
    private final String surname;
    private final String adressC;
    private Trip tripCustomer;
    private int idCustomer;

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setTripCustomer(Trip tripCustomer) {
        this.tripCustomer = tripCustomer;
    }

    public Customer(String name, String surname, String adressC) {
        this.name = name;
        this.surname = surname;
        this.adressC = adressC;
    }

    public Customer(String name, String surname, String adressC, Trip tripCustomer) {
        this.name = name;
        this.surname = surname;
        this.adressC = adressC;
        this.tripCustomer = tripCustomer;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

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
