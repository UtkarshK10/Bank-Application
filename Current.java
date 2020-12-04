package bankaccountapp;

public class Current extends Account{
   //List properties specific to current account
   private int debitCardNumber;
   private int debitCardPin;
   //Constructor to initialize the current account props	
   public Current(String name,String SSN,double initDeposit)
   {
	   super(name,SSN,initDeposit);
	   accountNumber="2"+accountNumber;
	   setDebitCard();
   }
   @Override
   public void setRate() {
	 rate=getBaseRate()*.15; 
   }
   //List any method specific to the current account	
   public void showInfo() { 
	   System.out.println("ACCOUNT TYPE: CURRENT");   
	   super.showInfo();
	   System.out.println(
			   "Your Current Account Features:"+
			   "\n Debit Card Number: "+debitCardNumber+
			   "\n Debit Card Pin: "+debitCardPin
			   );
   }
   
   private void setDebitCard() {
	   debitCardNumber=(int)(Math.random()*Math.pow(10, 12));
	   debitCardPin=(int)(Math.random()*Math.pow(10, 4));
   }
	
}
