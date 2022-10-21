import java.util.Scanner;

public class Account {
	// Class Variables
	int balance;
	int prevTransaction;
	String customerName;
	String customerID;
	
	// Class Constructor
	Account(String cname, String cid) {
		customerName = cname;
		customerID = cid;
	}
	
	void deposit(int amount) {
		if (amount !=0 ) {
			balance = balance + amount;
			prevTransaction = amount;
		}
	}
	
	void withdraw(int amount) {
		if (amount != 0) {
			balance = balance - amount;
			prevTransaction = -amount;
		}
	}
	
	void getPrevTransaction() {
		if (prevTransaction > 0) {
			System.out.println("Deposited: " + prevTransaction);
		} else if (prevTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(prevTransaction));
		}
	}
	
	
	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome " + customerName + " !");
		System.out.println("Your Bank ID is: " + customerID);
		System.out.println();
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("A. Check your Balance");
		System.out.println("B. Make Deposit");
		System.out.println("C. Make Withdraw");
		System.out.println("D. View Last Transaction");
		System.out.println("E. Exit");
		
		do {
			System.out.println("");
			System.out.println("Please Enter your option:");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println("");
			
			switch(option) {
			case 'A':
				System.out.println("============");
				System.out.println("Balance = $" + balance);
				System.out.println("============");
				break;
			case 'B':
				System.out.println("Enter an Amount To Deposit:");
				int amount = scanner.nextInt();
				deposit(amount);
				break;
			case 'C':
				System.out.println("Enter an Amount To Withdraw:");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				break;
			case 'D':
				System.out.println("================");
				getPrevTransaction();
				System.out.println("================");
				break;
			case 'E':
				System.out.println("================");
				break;
			default:
				System.out.println("Error! Invalid option. Please Enter A,B,C,...");
							
			}
						
		} while(option != 'E');
		System.out.println("Thank you for using our Bank");
	}
	
	
}
