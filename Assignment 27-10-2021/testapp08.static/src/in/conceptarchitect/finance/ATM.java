package in.conceptarchitect.finance;
import java.util.Scanner;


public class ATM {
	
		private int accountNumber;
		private String password;
		private double amount;

		public int getAccountNumber() {
			return accountNumber;
		}

		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		Bank B1=new Bank(accountNumber,password,amount);
			
		Scanner sc=new Scanner(System.in);
		
		public void withdraw(int accoutNumber,String Password,double amount) {
			B1.withdraw(accoutNumber,Password,amount);
		}
		
		public void Deposit(int accountNumber,double amount) {
			B1.Deposit(accountNumber,amount);
		}
		
		public void changePassword(String oldpassword, String newpassword) {
			B1.changePassword(oldpassword, newpassword);
		}
		
		
		public void menu(BankAccount accountNumber, String password) { 
		Scanner scan=new Scanner(System.in);
		int ch;
		do {
			System.out.println("Enter your choice");
			System.out.println("\n1. Display Account Details\n2. Deposit \n3. Withdraw \n4. Credit Interest\n5. Change Password\n6. Exit");
			ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				accountNumber.show();
				break;
			
			case 2:
				accountNumber.deposit(5000);
				break;
				
			case 3:
				accountNumber.withdraw(1000,"p@ss");
				break;
			
			case 4:
				accountNumber.creditInterest();
				break;
				
				
			case 5: accountNumber.changePassword("p@ss","keypass");
					break;
					
			case 6: return;

			}
		}
		while(ch!=6);		
		
	}

}
