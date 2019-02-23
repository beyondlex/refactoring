package ch1;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String name;
    private Vector<Rental> rentals = new Vector<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentalEnumeration = rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentalEnumeration.hasMoreElements()) {
            Rental each = rentalEnumeration.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();
            result += "\t" + each.getMovie().getTitle() + "\t" + each.getCharge() + "\n";
        }
        result += "Amount owed is " + getTotalCharge() + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration<Rental> rentalEnumeration = rentals.elements();
        while (rentalEnumeration.hasMoreElements()) {
            Rental each = rentalEnumeration.nextElement();
            result += each.getCharge();
        }
        return result;
    }

}
