import java.util.Scanner;

public class AtmInterface {
    public static void main(String args[]) {
        int balance = 50000, withdraw, deposit, Money;
        Scanner atm = new Scanner(System.in);
        while (true) {

            System.out.println("Choose 1 to Withdraw");
            System.out.println("Choose 2 to Deposit");
            System.out.println("Choose 3 to Check Balance");
            System.out.println("Choose 4 to Transfer");
            System.out.println("Choose 5 to Exit");
            int n = atm.nextInt();
            switch (n) {
                case 1:
                    System.out.print("Enter amount to be withdrawn:");
                    withdraw = atm.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Please collect the money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter amount to be deposited:");
                    deposit = atm.nextInt();
                    balance = balance + deposit;
                    System.out.println("Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Enter the amount to be transferred: ");
                    Money = atm.nextInt();
                    System.out.println("Requested amount has been transfered");
                    break;

                case 5:
                    System.out.println("    Thank you for using our services, please visit again!     ");
                   
            }
        }
    }
}