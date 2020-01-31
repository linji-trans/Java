package bankAccountApp;

public class Savings extends Account{
	//specific properties of saving accounts
	private int safetyBoxID;
	private int safetyBoxKey;
	
	//constructor to initialize saving accounts
	public Savings(String name, String myNumber, double initDeposit) {
		super(name,myNumber,initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyBox();
		}
	//create safety box ID(3-digit) and safety box key(4-digit)
	private void setSafetyBox() {
		safetyBoxID = (int)(Math.random()*900+100);
		safetyBoxKey = (int)(Math.random()*9000+1000);				
	}
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}
	
	//show the information of saving account	
	public void showInfo() {
		super.showInfo();
		System.out.println("New savings account created" +
		"\nYour safety box ID is: " + safetyBoxID +
		"\nYour safety box key is: " + safetyBoxKey + "\n");}
}
	
	//list specific methods


