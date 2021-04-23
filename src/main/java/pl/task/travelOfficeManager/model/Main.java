package pl.task.travelOfficeManager.model;



import pl.task.travelOfficeManager.model.AbroadTrip;
import pl.task.travelOfficeManager.model.Customer;
import pl.task.travelOfficeManager.model.DomesticTrip;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
        TravelOffice travelOffice = new TravelOffice();

     //   AbroadTrip abroadTrip = new AbroadTrip(LocalDate.of(2021, 4, 12), LocalDate.of(2021, 04, 12), "California", 7650, 350);
      //  DomesticTrip domesticTrip = new DomesticTrip(LocalDate.of(2021, 8, 12), LocalDate.of(2021, 10, 5), "Kazimierz", 600, 50);

//        Customer customer1 = new Customer("Alex", "Smith", "Katowice",abroadTrip);
//        Customer customer2 = new Customer("Bary", "Travery", "Wroclaw", domesticTrip);
//        Customer customer3 = new Customer("Tom", "Mellow", "Warszawa");


//        travelOffice.addCustomer(customer1);
//        travelOffice.addCustomer(customer2);
//        travelOffice.addCustomer(customer3);



        System.out.println(travelOffice.getCustomerInfo());


    }
}
