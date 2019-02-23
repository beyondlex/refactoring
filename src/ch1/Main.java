package ch1;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Bat man", Movie.NEW_RELEASE);
        Movie movie2 = new Movie("Pig", Movie.CHILDREN);
        Movie movie3 = new Movie("Venom", Movie.REGULAR);

        Rental rental1 = new Rental(movie1, 3);
        Rental rental2 = new Rental(movie2, 2);
        Rental rental3 = new Rental(movie3, 4);

        Customer customer = new Customer("Tom");
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        String statement = customer.statement();
        System.out.println(statement);

    }
}
