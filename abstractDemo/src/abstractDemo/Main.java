package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager1 = new CustomerManager();
		customerManager1.databaseManager = new MySqlDatabaseManager();
		customerManager1.getCustomers();
	}

}
