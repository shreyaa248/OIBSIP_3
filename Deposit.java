package test;

public class Deposit extends CheckBalance {
	public void depositMoney(int deposit_amount) {

    balance = balance + deposit_amount;
    System.out.println("Money has been successfully deposited. Updated balance: "+balance);
    System.out.println("");
	}

}
