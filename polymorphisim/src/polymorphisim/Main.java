package polymorphisim;

public class Main {

	public static void main(String[] args) {
		DatabaseLogger logger = new DatabaseLogger();
		CustomerManager customer1 = new CustomerManager(logger);
		customer1.Add();
	}

}
