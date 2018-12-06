package day_4_Ozzy;

public class BankAccount_Task {

	public static void main(String[] args) {
		
		BankAccount mike_account = new BankAccount();
		mike_account.setAccount_number(124);
		mike_account.setBalance(100);
		mike_account.setCustomer_name("Mike");
		
		
		mike_account.withdrawal(110);
		System.out.println(mike_account.getBalance());
	
	
	
	}

}
