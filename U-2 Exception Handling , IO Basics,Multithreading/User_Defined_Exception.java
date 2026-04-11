class UserDefinedException extends Exception {
	String desc;
	UserDefinedException( String message ) {
		// Passes the message to the parent Exception class
		super( message );
		desc = message;
	}
	@Override
	public String toString( ) {
		return "Custom Exception: "+desc;
	}
}
public class User_Defined_Exception {
	public static void main ( String [ ] args ) {
		// Manually triggering our custom exception
		try {
			throw new UserDefinedException("A user defined exception.");
		}
		catch(UserDefinedException ude ) {
			System.out.println("EXCEPTION OBJECT: "+ude);
			System.out.println("MESSAGE: "+ude.getMessage());
			System.out.println("	STACK TRACE: ");
			ude.printStackTrace( );
		}
	}
}