import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    // list to hold all objects of the frplogger class
    private List<FRPlogger> loggers = new ArrayList<FRPlogger>();

    //register interceptor 
    public void register(FRPlogger logger){
        loggers.add(logger); 
    }
    //invoke each interceptor
    public void dispatch(FRPContext FRPContext){
        for (FRPlogger logger : loggers){
            logger.intercept(FRPContext);
        }
    }
}
