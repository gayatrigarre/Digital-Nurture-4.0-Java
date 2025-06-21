package singletonpatternexample;

public class Logger {
	   private static Logger loggerInstance;

	    private Logger() {
	        System.out.println("Logger object created");
	    }

	    public static Logger getInstance() {
	        if (loggerInstance == null) {
	            loggerInstance = new Logger();
	        }
	        return loggerInstance;
	    }

	    public void logMessage(String text) {
	        System.out.println("[Logger]: " + text);
	    }
}
