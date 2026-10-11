package exceptionhandling.customExceptionTasks;

public class B02_InvalidAgeException extends Throwable {

	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "You are not eligible to cast the Vote";
	}
}
