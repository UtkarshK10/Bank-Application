package bankaccountapp;

public interface IBaseRate {
	//write a method that returns the base rate
	default double getBaseRate() {
		return 2.5;
	}

}
