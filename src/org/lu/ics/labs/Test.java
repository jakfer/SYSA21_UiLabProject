package org.lu.ics.labs;

public class Test {
	public static void main(String[] args) {
		// Skapar två nya kreditkort
		CreditCard CreditCard1 = new CreditCard(123, "Visa");
		CreditCard CreditCard2 = new CreditCard(234, "Master Card");
		
		// Skapar två nya kunder
		Customer customer1 = new Customer("111111-1111", "Anna Andersson");
		Customer customer2 = new Customer("222222-22222", "Beata Bengtsson");
		
		// Skapar ett nytt kundregister
		CustomerRegister customers = new CustomerRegister();
		
		// Kopplar kort till kund
		CreditCard1.setHolder(customer1);
		CreditCard2.setHolder(customer2);
		
		// Kopplar kund till kort
		customer1.setCreditcard(CreditCard1);
		customer2.setCreditcard(CreditCard2);
		
		// Lägger in kunderna i ArrayList
		customers.addCustomer(customer1);
		customers.addCustomer(customer2);
		
		// Testar några av objektens metoder
		System.out.println(CreditCard1.getHolder().getCName());
		System.out.println(customer2.getCreditcard().getCardNumber());
		Customer tmpC = customers.findCustomer("111111-1111");
		if (tmpC != null) {
			System.out.println("Hittade: " + tmpC.getCName());
		}
			customers.removeCustomer("111111-1111");
			Customer tmpCustomer = customers.findCustomer("111111-1111");
		if (tmpCustomer == null) {
			System.out.println("Fungerar!");
		}	
	}
}
