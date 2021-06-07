package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger [] loggers = {new EmailLogger(), new SmsLogger(), new FileLogger(), new DatabaseLogger() };
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer customer1 = new Customer(1, "Muhammed", "Sedef");
		customerManager.add(customer1);

	}

}
