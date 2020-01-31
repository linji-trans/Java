package bankAccountApp;

public class Checking extends Account{
	//specific properties of checking accounts
	private long debitCardNumber;
	private int PIN;
	
	
	//constructor to initialize checking accounts
	public Checking(String name, String myNumber, double initDeposit) {
		super(name,myNumber,initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCardNumber();}
	
	//create a debit card number(12-digit) and a PIN(4-digit)
	private void setDebitCardNumber() {
		debitCardNumber = (long)(Math.random()*(Math.pow(10,11)*9)+ Math.pow(10,11));
		PIN = (int)(Math.random()*9000+1000);
		}

	@Override
	public void setRate() {
		rate = getBaseRate() * .15;}
	
	// show the information of checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("New checking account created"+
		"\nYour debit card number is: " + debitCardNumber +
		"\nYour PIN is: " + PIN + "\n");
	}
	}	
	//list specific methods
	
	
