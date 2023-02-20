import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CustomerTest {
      // creating 3 movies that will be rented by a customer 
      Movie Encanto = new Movie("Encanto", Movie.CHILDREN);
      Movie Morbius = new Movie("Morbius", Movie.REGULAR);
      Movie Aftersun = new Movie("Aftersun", Movie.NEW_RELEASE); 

      // creating a customer that will rent out the movies above
      Customer customer = new Customer("John Doe");

    // Test to see if all the rentals add up correctly 
    @Test
    public void shouldSumVariousRentals() {
        customer.addRental(new Rental(Encanto, 2));
        customer.addRental(new Rental(Morbius, 1));
        customer.addRental(new Rental(Aftersun, 3));
        double expectedTotalCharge = 12.5;
        double actualTotalCharge = customer.getTotalCharge();
        double delta = 0; 
        assertEquals(expectedTotalCharge, actualTotalCharge, delta);
    }

}
