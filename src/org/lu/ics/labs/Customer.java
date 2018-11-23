package org.lu.ics.labs;

public class Customer {
	private String cNumber;
	private String cName;
	private CreditCard creditcard;
	
	public String getCNumber() {
		return this.cNumber;
	}
	
	public void setCNumber(String cNumber) {
		this.cNumber = cNumber;
	}
		
	public String getCName() {
		return this.cName;
	}
	
	public void setCName(String cName) {
		this.cName = cName;
	}
		
	public CreditCard getCreditcard() { 
		return this.creditcard;
	}

	public void setCreditcard(CreditCard value) {
		this.creditcard = value;
	}
		
	public void addCreditcard(CreditCard card) {
		this.setCreditcard(card);
	}
		
	public Customer(String cNumber, String cName) {
		this.setCNumber(cNumber);
		this.setCName(cName);
	}
}
