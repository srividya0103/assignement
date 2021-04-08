package day3.task1;

public class BankAccount {

	private String accountHolderName;
	private static int balance;
	private boolean status; // true for active / false for inactive
	
	// -------- 
	
	// business methods
	public static void doWithdrawal(int amount)
	{
		balance = balance-amount;
		
		 // new balance
	}
	
	public static int doDeposit(int amount)
	{
		setBalance(getBalance() + amount);
		return getBalance();
	}

	public static int getBalance() {
		return balance;
	}

	public static void setBalance(int balance) {
		BankAccount.balance = balance;
	}
	
}
