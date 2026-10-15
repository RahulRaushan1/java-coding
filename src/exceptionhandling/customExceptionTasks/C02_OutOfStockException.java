package exceptionhandling.customExceptionTasks;

public class C02_OutOfStockException extends Throwable {

	private static final long serialVersionUID = 1L;
	int quantity;

	public C02_OutOfStockException(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String getMessage() {
		return "Out of Stock! Requested quantity: " + quantity;
	}
}
