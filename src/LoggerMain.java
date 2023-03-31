public class LoggerMain {
    public static void main(String[] args) throws Exception {
        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));

        logger.log(Logger.ERROR, "Exception occured");
        logger.log(Logger.DEBUG, "Debugging mode on");
        logger.log(Logger.INFO, "Just for info");
        logger.log(4, "Test Case");
    }
}
