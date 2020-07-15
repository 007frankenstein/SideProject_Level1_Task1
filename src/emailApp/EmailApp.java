package emailApp;

import java.util.Scanner;

public class EmailApp {
	
	public static void main(String[] args) {
		
		System.out.print("Enter your name: \n");
		
		System.out.print("Firstname: \n");
		Scanner in1 = new Scanner(System.in);
		String firstName = in1.nextLine();
		
		System.out.print("Lastname: \n");
		Scanner in2 = new Scanner(System.in);
		String lastName = in2.nextLine();
		
		Email em1 = new Email(firstName, lastName);
		
		System.out.println(em1.showInfo());
		
		em1.changePassword();
		
	}
}
