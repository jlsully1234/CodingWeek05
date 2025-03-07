

// AsterickLogger class that implements the Logger interface
public class AsterickLogger implements Logger {

	
	// Overrides the log method to display the message surrounded by astericks
	// Method to log a message with asterisks on either side
	
	@Override
	public void log(String message) {
	//concatenates the astericks with the message. 	
	System.out.println("***" + message + "***" );	
	}

	// Overrides the error method to display the error message surrounded by astericks
	// and  prints to console
	// Method to log an error message inside a box of asterisks
	
	@Override
	public void error(String message) {
		String errorMessage = "Error: " + message;
		String border = "*".repeat(errorMessage.length() + 6);
		System.out.println(border);
		System.out.println("***" + errorMessage + "***");
		System.out.println(border);
		}	
}
