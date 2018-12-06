package day_4_Ozzy;

public class BankAccount {

	private int account_number;
	private int balance;
	private String customer_name;
	private String email;
	private int phone_number;
	
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	
	
	public void deposit(int amount) {
		this.balance=this.balance+amount;
		System.out.println("You have deposited :" + amount);
	}
	
	public void withdrawal(int withdraw) {
		if(this.balance-withdraw<0) {
			System.out.println("Only this amount available for withdrew "+ this.balance);
		}else {
			this.balance=this.balance-withdraw;
			System.out.println("Withdrawal of " + withdraw +  " processed. Remaining balance = "+ this.balance);
		}
	}
	
	
	
}
