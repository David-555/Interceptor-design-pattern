public class FRPlogger implements interceptor {
    @Override
    public void intercept(FRPContext frpContext){
        //frpContext.getCustomer().getName();
        String output = "The Customer " + frpContext.getCustomer();
        output += " has " + frpContext.getPoints() + " points."; 

        //frpContext.setOutput(output);
    } 
}
