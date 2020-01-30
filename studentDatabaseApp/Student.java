package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String name;
	private int year;
	private int studentID;
	private String enrolledCourses = "";
	private int tuition;
	private static int costofcourse = 600;
	private static int id = 0;
	
	//constructor: enter students's name and year
	public Student() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student name: ");
		this.name = input.nextLine();
		System.out.println("1 for Freshman\n2 for Sophmore\n3 for Junior\n4 for Senior\nEnter the grade year: ");
		this.year = input.nextInt();
		setStudentID();
		enroll();
	}	
	//generate a 5-digit unique ID(first number- grade lever)
	private void setStudentID() {
		this.studentID = year*10000 + id;
		id++;}
	
	//choose courses, calculate tuition
	public void enroll() {
		   do{Scanner input = new Scanner(System.in);
		   System.out.println("Enter course to enroll(enter q to quit): ");
		   String enrolled = input.nextLine();
		   if(!enrolled.equals("q")) {enrolledCourses = enrolledCourses + "\n  " + enrolled;
		   tuition = tuition + costofcourse;}
		   else{
			   break;
		   }
		   }while(true);		
	}
	// view balance
	public void viewBalance() {
		System.out.println("Your balance is: " + tuition + "$");}
	// pay tuition
	public void payTuition(){
		viewBalance();
		Scanner input = new Scanner(System.in);
		System.out.println("How much do you want to pay($): ");
		int paid = input.nextInt();
		tuition = tuition - paid;
		System.out.println("Thank you for your payment of " + paid + "$ \n");
	}
	// show information
	public String showInfo(){
		return "Name: " + name +
				"\nGrade Year: " + year +
				"\nStudent ID: " + studentID +
				"\nEnrolled courses: " + enrolledCourses +
				"\nYour balance is: " + tuition + "$" + "\n";}
	
}
