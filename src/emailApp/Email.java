package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private int defaultPasswordLength = 10;
	private String email;
	private int mailboxCapacity = 1024;
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email Created:" + this.firstName + " " + this.lastName); 
		
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + ".com";
		System.out.println("Your email is: " + email);
	}
	
	private String setDepartment() {
		System.out.println("Department IDs:\n1 for Sales\n2 for Marketing\n3 for Development\n4 for Accounts\n0 for none\nEnter the Department ID: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if (deptChoice == 1) {
			return "sales";
		}
		else if (deptChoice == 2 ) {
			return "mark";
		}
		else if (deptChoice == 3) {
			return "dev";
		}
		else if (deptChoice == 4) {
			return "acc";
		}
		else
			return "";
	}
	
	private String randomPassword(int length) {
		String passwordSet = "QWERTYUIOPASDFGHJKLZXCVBNM0987654321@#$&";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void changePassword() {
		System.out.println("Set New Password: ");
		Scanner in = new Scanner(System.in);
		String newPassword = in.nextLine();
		System.out.println("Your New Password is: "+ newPassword);
		
		this.password = newPassword;
	}
	
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "USER INFORMATION:\n" + "NAME: " + firstName + " " + lastName + "\n" +
				"EMAIL ID: " + email + "\n" +
				"MAILBOX CAPACITY: " + mailboxCapacity + " " +"mb";
	}
	
}


