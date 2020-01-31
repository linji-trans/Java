package bankAccountApp;

public abstract class Account implements BaseRate{
	//common properties of accounts
	protected String name;
	protected String myNumber;
	private double initDeposit;
	private double balance;
	protected String accountNumber;
	protected double rate;
	private static int n = 10000;
	
	//constructor to initialize accounts
	protected Account(String name, String myNumber, double initDeposit) {
		this.name = name;
		this.myNumber = myNumber;
		this.accountNumber = setAccountNumber();
		balance = initDeposit;
		setRate();}
	
	// a method to set account number(11-digit, 1or2+lastTwo of myNumber + unique 5 + random 3)
	private String setAccountNumber() {
		String lastTwo = myNumber.substring(myNumber.length()-2,myNumber.length());
		n++;
		int random2 =(int)(Math.random()*900+100);
		return lastTwo + n + random2;
	}
	//set rate
	public abstract void setRate();
	
	//methods(deposit/withdraw/transfer)
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing " + amount + "$");
		ShowBalance();
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing " + amount + "$");
		ShowBalance();
	}
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering " + amount + "$ to " + toWhere);
		ShowBalance();
		}
	public void ShowBalance() {
		System.out.println( "User: "+ name + "\nAccount Number: " + accountNumber + "\nYour balance is: " + balance +"$ now." + "\n************");}
	
	//calculate interest
	public void compound() {
		double interest = balance*rate/100;
		balance = balance + interest;
		System.out.println("Including the interest, your balance is: " + balance + "$\n********************");
	}
	//show information
	public void showInfo() {
		System.out.println("****************"+"\nNew user: "+ name + 
				"\nBalance: " + balance + "$" +
				"\nAccount Number: " + accountNumber+
				"\nRate: "+ rate + "%");
	}
	
}
