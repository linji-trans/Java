package bankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		String file = "NewAccounts.csv";//change to the right path
		List<Account> accounts= new LinkedList<Account>();
		
		//read a csv file and create accounts
		List<String[]> newAccounts = bankAccountAppUtilities.CSV.read(file);
		for(String[] Accounts: newAccounts) {
			String name = Accounts[0];
			String accountType = Accounts[1];
			String myNumber = Accounts[2];
			double initDeposit = Double.parseDouble(Accounts[3]);
			
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, myNumber, initDeposit));
			}
			else if (accountType.equals("Checking")) {
				accounts.add(new Checking(name, myNumber, initDeposit));
			}
			else{
				System.out.println("Account type error.");}
		}
		
		for(Account acc:accounts) {
			acc.showInfo();
		}
		//make the third person deposit 300
		accounts.get(2).deposit(300);
	}
}
