
//Logger interface definition
public interface Logger {
	
	// Method to log the string; defines a function for logging that takes a string message as input and 
	//performs some operation with it, without returning any value.
	void log(String message);
	
	
	// A method named error that takes a String parameter called message and does not return any value. 
	void error(String message);
}
