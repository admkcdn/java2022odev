package polymorphisim;

public class CustomerManager {
	private BaseLogger _logger;

	public CustomerManager(BaseLogger logger) {
		_logger = logger;
	}

	public void Add() {
		System.out.println("Müşteri eklendi!");
		_logger.Log("Müşteri Eklendi");
	}
}
