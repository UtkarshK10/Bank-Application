package bankaccountapp;

public abstract class Account implements IBaseRate {
	//list common properties for savings and current accounts
	String name;
	String SSN;
	protected String accountNumber;
	double balance;
	protected double rate;
	static int index=10000;
	
	//Constructor to set base properties and initialize the account
	public Account(String name,String SSN,double initDeposit) {
		this.name=name;
		this.SSN=SSN;
		this.balance=initDeposit;
		index++;
		//set account number
		this.accountNumber=setAccountNumber();	
		//set interest rate
		setRate();
	}
	//list common methods for transaction.
	public abstract void setRate();
	private String setAccountNumber() {
		String lastTwoOfSSN=SSN.substring(SSN.length()-2, SSN.length());
		int uniqueID=index;
		int randomNumber=(int)(Math.random()*Math.pow(10, 3));
		return lastTwoOfSSN+uniqueID+randomNumber;
	}
	public void compound() {
		double accruedInterest=balance*(rate/100);
		balance+=accruedInterest;
		System.out.println("Accrued Interest: Rs."+accruedInterest);
		printBalance();
	}
    public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Depositing Rs."+amount);
		printBalance();
	}
	public void withdraw(double amount){
		balance=balance-amount;
		System.out.println("Withdrawing Rs."+amount);
		printBalance();
	}
	public void transfer(String toWhere,double amount) {
		balance=balance-amount;
		System.out.println("Transferring Rs."+amount+" to "+toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your Balance is: Rs."+balance);
	}
	public void showInfo() {
		System.out.println(
				"Name: "+name+
				"\nAccount Number: "+accountNumber+
				"\nBalance: "+balance+
				"\nRate: "+rate+"%"
				);
	}
}
