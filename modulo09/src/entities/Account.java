package entities;

public class Account {
	private int numberAccount;
	public String name;
	private double value;
	
	public Account(int numberAccount, String name) {
		this.numberAccount = numberAccount;
		this.name = name;
	}
	
	public Account(int numberAccount, String name, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.name = name;
		deposit (initialDeposit);
	}
	
	public int getNumberAccount() {
		return numberAccount;
	}
	
	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}
	
	public double getValue() {
		return value;
	}
	
	public void deposit(double amount) {
		value += amount;
	}
	public void withdraw(double amount) {
		 value -= amount + 5;
	}
	
	public String toString() {
		return "Account " 
				+ numberAccount 
				+ ", Holder: " 
				+ name + ", Balance: $ " 
				+ String.format("%.2f", value);
	}
}
