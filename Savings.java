package bankaccountapp;

public class Savings extends Account {
	   //List properties specific to savings account
	   private int safetyDepositBoxID;
	   private int safetyDepositBoxKey;
	   //Constructor to initialize the savings account props	
	   public Savings(String name,String SSN,double initDeposit) {
		   super(name,SSN,initDeposit);
		   accountNumber="1"+accountNumber;
		   setSafetyDepositBox();
	   }
	   @Override
	   public void setRate() {
		  rate=getBaseRate()-.25; 
	   }
	   //List any method specific to the savings account
	   public void showInfo() {
		   System.out.println("ACCOUNT TYPE: SAVINGS");
		   super.showInfo();
		   System.out.println(
				   "Your Savings Account Features:"+
		           "\n Safety Deposity Box ID: "+safetyDepositBoxID+
		           "\n Safety Deposit Box Key: "+safetyDepositBoxKey
				   );
	   }
	   private void setSafetyDepositBox() {
		   safetyDepositBoxID=(int)(Math.random()*Math.pow(10, 3));
		   safetyDepositBoxKey=(int)(Math.random()*Math.pow(10, 4));
	   }
	   
}
