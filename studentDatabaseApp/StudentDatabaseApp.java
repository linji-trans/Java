package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		//ask the amount of new students
		Scanner input = new Scanner(System.in);
		System.out.println("The amount of new students: ");
		int number = input.nextInt();
		
		//create new students
		Student students[] = new Student[number];
		for(int n = 0; n < number; n++) {
			students[n] = new Student();
			students[n].payTuition();}
		
		for(int n = 0; n < number; n++) {
			System.out.println(students[n].showInfo());}
		
	}

}
