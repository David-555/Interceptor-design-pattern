public class CustomerDriver{
    public static void main(String[] args) {
        // creating 3 movies that will be rented by a customer 
        Movie Encanto = new Movie("Encanto", Movie.CHILDREN);
        Movie Morbius = new Movie("Morbius", Movie.REGULAR);
        Movie Aftersun = new Movie("Aftersun", Movie.NEW_RELEASE); 

        // creating a customer that will rent out the movies above
        Customer customer = new Customer("John Doe");

        // creating rentals for the above movies with how long they were rented for 
        Rental rental1 = new Rental(Encanto, 4);
        Rental rental2 = new Rental(Morbius, 3);
        Rental rental3 = new Rental(Aftersun, 2);

        // adding the rentals to the customer showing that they are renting the movies
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        // prints out the receipt for the rentals 
        System.out.print(customer.statement());

    }
}