public class FRPlogger implements IFRPlogger {

    void IFRP(FRPContext frpContext){
        frpContext.getMovie();
        frpContext.getCustomer();
        frpContext.getPoints();
    } 
}
