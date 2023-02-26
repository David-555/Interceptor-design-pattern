import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private List<FRPlogger> loggers = new ArrayList<FRPlogger>();

    //register interceptor 
    public void register(FRPlogger logger){
        loggers.add(logger); 
    }
    //invoke interceptor
    public void dispatch(FRPContext FRPContext){
        for (FRPlogger logger : loggers){
            logger.intercept(FRPContext);
        }
    }
}
