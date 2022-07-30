package test;

public class Withdraw extends CheckBalance {
	public void withdrawMoney(int withdraw_amount)
	{
    
    if ( balance >=  withdraw_amount) {
        balance = balance - withdraw_amount;
        System.out.println("Please collect the money. Updated balance: "+balance);
    } else {
        System.out.println("Insufficient Balance");
    }
    System.out.println("");
	}
   

}
