package exceptionhandling.customExceptionTasks;

public class A02_InvalidMarksException extends Throwable {

	private static final long serialVersionUID = 1L;
	int marks;

	public A02_InvalidMarksException(int marks) {
		this.marks = marks;
	}

	@Override
	public String getMessage() {
		return "Marks is Invalid: " + marks;
	}
}