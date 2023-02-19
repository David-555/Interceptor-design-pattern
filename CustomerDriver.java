public class CustomerDriver{
    public static void main(String[] args) {
        Movie Morbius = new Movie("Morbius", Movie.CHILDREN);
        Movie Encanto = new Movie("Encanto", Movie.REGULAR);
        Movie Aftersun = new Movie("Aftersun", Movie.NEW_RELEASE); 

        Customer customer = new Customer("John Doe");

        Rental rental1 = new Rental(Morbius, 4);
        Rental rental2 = new Rental(Encanto, 2);
        Rental rental3 = new Rental(Aftersun, 3);

        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        System.out.print(customer.statement());

    }
}