public abstract class Logger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;
    Logger nextLogger;
    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void log(int logLevel, String message) {
        if(nextLogger != null) {
            nextLogger.log(logLevel, message);
        }
        else System.out.println("Inavlid log level");
    }
}
