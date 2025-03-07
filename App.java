
// App class which contains the main method to test our loggers
public class App {

	public static void main(String[] args) {
		
		// Instantiates  AsteriskLogger
		Logger asterickLogger = new AsterickLogger();
		   // Instantiates  SpacedLogger
		Logger spacedLogger = new SpacedLogger();

	// Test the log and error methods for AsteriskLogger
		asterickLogger.log("Hello");
		asterickLogger.error("Hello");
	
		//Test the log and error methods for SpaceLogger
		spacedLogger.log("Hello");
		spacedLogger.error("Hello");
	
	
	}

}
