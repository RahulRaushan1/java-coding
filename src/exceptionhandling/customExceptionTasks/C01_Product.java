package exceptionhandling.customExceptionTasks;

public class C01_Product {
	String productName;
	int quantity;

	public C01_Product(String productName, int quantity) {
		this.productName = productName;
		this.quantity = quantity;
	}

	void purchase(int quantity) throws C02_OutOfStockException {
		if (quantity > this.quantity) {
			throw new C02_OutOfStockException(quantity);
		} else {
			this.quantity = this.quantity - quantity;

			System.out.println("Purchase Successful");
			System.out.println("Product Name: " + productName);
			System.out.println("Remaining Stock: " + this.quantity);
		}
	}
}