// Holds data for the interceptor 
public class FRPContext {
    public Customer customer;
    private String output; 

    public FRPContext(Customer customer){
        this.customer = customer; 
    }

    public Customer getCustomer() {
        return customer;
    }
    // get frp of customer
    public int getPoints() {
        return customer.getTotalFrequentRenterPoints();
    }
    // returns output from frplogger
    public String getOutput() {
        return output; 
    }
    // method used in the frplogger class to set the output 
    public void setOutput(String intput){
        output = intput; 
    }

}