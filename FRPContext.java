public class FRPContext {
    private Movie movie; 
    private Customer customer;
    private int points; 

    FRPContext(Movie movie, Customer customer){
        this.customer = customer; 
        this.movie = movie; 
        this.points = customer.getTotalFrequentRenterPoints(); 
    }

    public Movie getMovie() {
        return movie;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getPoints() {
        return points;
    }

}