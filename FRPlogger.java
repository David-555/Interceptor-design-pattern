// concrete interceptor for basic logging of frps of customers
public class FRPlogger implements interceptor {
    @Override
    public void intercept(FRPContext frpContext){
        // gets the customers name and frp and stores it in a string to be used later
        String output = "The Customer " + frpContext.getCustomer();
        output += " has " + frpContext.getPoints() + " points."; 

        frpContext.setOutput(output);
    } 
}
 