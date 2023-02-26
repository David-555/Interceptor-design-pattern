public class FRPContext {
    public Customer customer;
    private String output; 

    public FRPContext(Customer customer){
        this.customer = customer; 
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getPoints() {
        return customer.getTotalFrequentRenterPoints();
    }

    public String getOutput() {
        return output; 
    }

    public void setOutput(String intput){
        output = intput; 
    }

}