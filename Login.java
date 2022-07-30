package test;

import java.util.Scanner;

public class Login {
	String user_id, user_pin;

	public void takeInput() {
		Scanner atm1 = new Scanner(System.in);
		System.out.println("Please enter user id ");
		user_id = atm1.nextLine();
		System.out.println("Please enter user pin ");
		user_pin = atm1.nextLine();
	}

	public void validate_login() {
		takeInput();
		if ((user_id.contentEquals("Shreya")) && (user_pin.contentEquals("12345"))) {
			System.out.println("Login successful");

		} else {
			System.out.println("Invalid credentials. Please try again");
			takeInput();

		}

	}

}
