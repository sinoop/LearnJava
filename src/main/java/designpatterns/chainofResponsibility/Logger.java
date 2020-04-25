package designpatterns.chainofResponsibility;

public abstract class Logger {
    public static int OUTPUTINFO = 1;
    public static int ERRORINFO = 2;
    public static int DEBUGINFO = 3;
    protected int levels;
    protected Logger nextLevelLogger;

    public void setNextLevelLogger(Logger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    public void logMessage(int passedLevel, String msg) {
        if (this.levels <= passedLevel) {
            displayLogInfo(msg);
        }
        if (nextLevelLogger != null) {
            nextLevelLogger.logMessage(passedLevel, msg);
        }
    }

    protected abstract void displayLogInfo(String msg);
}