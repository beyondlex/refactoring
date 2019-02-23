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
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentalEnumeration = rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentalEnumeration.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = rentalEnumeration.nextElement();

            thisAmount = amountFor(each);

            frequentRenterPoints ++;
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                    each.getDaysRented() > 1) {
                frequentRenterPoints ++;
            }
            result += "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";
            totalAmount += thisAmount;
        }
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

    private double amountFor(Rental rental) {
        return rental.getCharge();
    }
}
