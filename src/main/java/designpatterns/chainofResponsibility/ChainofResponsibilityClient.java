package designpatterns.chainofResponsibility;

public class ChainofResponsibilityClient {
    static java.util.logging.Logger l = java.util.logging.Logger.getLogger("ChainofResponsibilityClient");


    private static Logger doChaining() {
        l.info("Test");
        l.warning("Warning");
        l.config("Config Message");


        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);
        Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
        consoleLogger.setNextLevelLogger(errorLogger);

        Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }

    public static void main(String[] args) {
        Logger chainLogger = doChaining();

        chainLogger.logMessage(Logger.OUTPUTINFO, "Enter the sequence of values ");
        chainLogger.logMessage(Logger.ERRORINFO, "An error is occured now");
        chainLogger.logMessage(Logger.DEBUGINFO, "This was the error now debugging is compeled");
    }
}