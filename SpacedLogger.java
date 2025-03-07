

// // SpacedLogger class that implements the Logger interface
public class SpacedLogger implements Logger {

    // Overrides the log method to display the message with spaces between characters
	// Method to log a message with spaces between each character
	@Override
    public void log(String message) {
		System.out.println(addSpaces(message));
        }
              	
	// Overrides the error method to display the error message with spaces between characters
	@Override
	public void error(String message) {
	      System.out.println("ERROR: " + addSpaces(message));
	    }

	// The method is designed to take a string and return a new string with spaces inserted between 
	// each character of the original string. However, it currently lacks a return statement, which 
	// needs to be added for the method to function correctly.
	private String addSpaces(String message) {
	        StringBuilder spacedMessage = new StringBuilder();
	        for (int i = 0; i < message.length(); i++) {
	        	spacedMessage.append(message.charAt(i));
	        	if (i < message.length() - 1) {
	        	spacedMessage.append(" ");
	  }
	  }
	  // converts the spacedMessage object to a string and returns that string to the caller of the method.
	        	return spacedMessage.toString();
	  }
  }