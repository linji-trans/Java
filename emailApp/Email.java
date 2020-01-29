package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String major;
	private String university = "Kyoto.co.jp";
	private String email;
	private int mailboxCapacity = 5;
	private int passwordLength = 10;
	
	
	//Constructor to receive names
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + firstName + " " + lastName);
		
		//Call a method asking for the department-return the department
		this.major = setMajor();
		
		//Call a method that returns a random password
		this.password = randomPassword(passwordLength);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase()+ "@" + major + "." + university;
	
	}
	
	
	//Ask for the department
	private String setMajor() {
		System.out.print("Major code:\n 1 for Science \n 2 for Arts\n 3 for engineering\n Enter department code: ");
		Scanner putIn = new Scanner(System.in);
		int choice = putIn.nextInt();
		if (choice == 1) {return "science";}
		else if (choice == 2) {return "arts";}
		else if (choice == 3) {return "engineer";}
		else {return "";}
	}
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i< length; i++) {
		   int rand = (int) (Math.random() * passwordSet.length());
		   password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public String showInfo() {return "New user: " + firstName + " " + lastName
			+ "\nYour email address is: " + email 
			+ "\nYour password is: " + password 
			+ "\nThe capacity is: " + mailboxCapacity + "G";	
	}
		
}


