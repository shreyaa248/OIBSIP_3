package test;

import java.util.Scanner;

public class AtmInterface {
	public static void main(String args[]) {
		int balance = 50000, withdraw, deposit, Money;
		Scanner atm = new Scanner(System.in);
		System.out.println("Welcome to the ATM services!");
		System.out.println("Please enter login credentials: ");
		
		Login login = new Login();
		login.validate_login();

		System.out.println("Choose 1 to Check Balance");
			System.out.println("Choose 2 to Withdraw");
			System.out.println("Choose 3 to Deposit");
			System.out.println("Choose 4 to Transfer");
			System.out.println("Choose 5 to Exit");
			int n = atm.nextInt();
			switch (n) {

			case 1:
				CheckBalance checkBalance = new CheckBalance();
				checkBalance.check_Balance();


			case 2:
				System.out.print("Enter amount to be withdrawn:");
				withdraw = atm.nextInt();
				Withdraw withdrawMoney = new Withdraw();
				withdrawMoney.withdrawMoney(withdraw);

			case 3:
				System.out.print("Enter amount to be deposited:");
				deposit = atm.nextInt();
				Deposit depositMoney = new Deposit();
				depositMoney.depositMoney(deposit);

			case 4:
				System.out.println("Enter the amount to be transferred: ");
				Money = atm.nextInt();
				Transfer transferedMoney = new Transfer();
				transferedMoney.transferMoney();


			case 5:
				Exit exitprogram = new Exit();
				exitprogram.ExitSystem();
				break;

			}
		}
	}
