package singletonpatternexample;
public class Main {
	public static void main(String[] args) {
	        Logger firstLogger = Logger.getInstance();
	        Logger secondLogger = Logger.getInstance();

	        firstLogger.logMessage("System is booting up...");
	        secondLogger.logMessage("System check complete.");

	        if (firstLogger == secondLogger) {
	            System.out.println("Only one Logger instance is used. Singleton confirmed.");
	        } else {
	            System.out.println("Different instances detected. Singleton failed.");
	        }
          }
}