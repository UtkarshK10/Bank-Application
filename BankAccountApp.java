package bankaccountapp;
import java.util.*;
public class BankAccountApp {

	public static void main(String[] args) {
		List<Account>accounts=new LinkedList<>();
		String file="C:\\Users\\ukhan\\eclipse-workspace\\Project1\\src\\bankaccountapp\\NewBankAccounts.csv";
		List<String[]>newAccountHolders=utilities.CSV.read(file);
		for(String[] accountHolder:newAccountHolders )
		{
			
			String name=accountHolder[0];
			String SSN=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit=Double.parseDouble(accountHolder[3]);
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name,SSN,initDeposit));
			}else {
				accounts.add(new Current(name,SSN,initDeposit));
			}
		}
		for(Account acc:accounts)
		{
			acc.showInfo();
			System.out.println("******************************");
		}
	}
}
