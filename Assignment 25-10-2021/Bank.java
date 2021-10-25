package mypackage;

import java.util.Scanner;

public class Bank {
	private int AccountNumber;
	private String Name;
	private String Password;
	private long Balance;
	private int InterestRate;
	Scanner scan=new Scanner(System.in);
	
	public void createAccount()
	{
		
		System.out.println("Enter the Bank Account Number:");
		AccountNumber=scan.nextInt();
		System.out.println("Enter the Name of the Person:");
		Name=scan.next();
		System.out.println("Enter the Password:");
		Password=scan.next();
		System.out.println("Enter the balance:");
		Balance=scan.nextLong();
		System.out.println("Enter the Interest Rate");
		InterestRate=scan.nextInt();
		System.out.println("\n------------------------------------------\n\tAccount created successfully!\n------------------------------------------");
		
	}
		
	public void deposit()
	{
		System.out.println("Enter the Account number to deposit");
		long acc=scan.nextLong();
		System.out.println("Enter the password :");
		String pswd=scan.next();
		if(AccountNumber==acc && Password.equals(pswd))
		{
		
			System.out.println("Enter the amount to be deposit:\n");
			long Amount=scan.nextLong();
		
			if(Amount<=0)
			{
				System.out.println("---------------Please try again and enter minimum deposit amount---------------\n");
			}
			else
			{
				System.out.println("\n------------------------------------------\n\tTransaction successful!\n------------------------------------------");			
				System.out.println("Successfully deposited " +Amount+" rupees");
				System.out.println("Available Balance is " +(Balance+Amount)+" rupees");
			}
		}
		else
		{
				System.out.println("Invalid Account Number or Password!!!!");
		}
	}
	
	public void withdraw()
	{
		
		System.out.println("Enter the Account number to withdrwal");
		long acc=scan.nextLong();
		System.out.println("Enter the password :");
		String pswd=scan.next();
		if(AccountNumber==acc && Password.equals(pswd))
		{
			System.out.println("Enter the amount to be withdraw :");
			long Amount=scan.nextLong();
			if(Amount<=0)
			{
				System.out.println("\n---------------Please try again and enter minimum withdrawal amount---------------\\n");
			}
			else if(Amount>Balance)
			{
				System.out.println("Insufficient Balance!!!");
			}
			else 
			{
				System.out.println("\n------------------------------------------\nTransaction successful!\n------------------------------------------");
				System.out.println("Available balance is " +(Balance-Amount)+" rupees");
			}
			
		}
		else
		{
			System.out.println("Invalid Account Number or Password!!!!");
		}
		
		
	}
	public void creditInterest()
	{
		System.out.println("Enter the Account number");
		long acc=scan.nextLong();
		System.out.println("Enter the password:");
		String pswd=scan.next();
		if(AccountNumber==acc && Password.equals(pswd))
		{
			
			long Interest=(Balance*InterestRate/1200);
			System.out.println("Credited Interest is :"+Interest);
			System.out.println("Available Balance is :"+(Interest+Balance));
		}
		else
		{
			System.out.println("Invalid Account Number or Password!!!");
		}
	
	}
	public void showDetails()
	{
		System.out.println("Enter the Account number");
		long acc=scan.nextLong();
		System.out.println("Enter the password:");
		String pswd=scan.next();
		if(AccountNumber==acc && Password.equals(pswd))
		{
			System.out.println("--------------------Account Details-------------------");
			System.out.println("\nAccount Number:"+AccountNumber+"\nName:"+Name+"\nBalance:"+Balance+"\nInterest rate:"+InterestRate);
			
		}
		else
		{
			System.out.println("Invalid Account Number or Password!!!");
		}
		
}
	
	public static void main(String[] args)
	{
		Bank b1=new Bank();
			
		Scanner scan=new Scanner(System.in);
		
		int ch;
		do {
			System.out.println("Enter your choice");
			System.out.println("\n1. Create Account\n2. Deposit \n3. Withdraw \n4. Credit Interest \n5. Display Account Details\n6. Exit");
			ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				b1.createAccount();
				break;
			
			case 2:
				b1.deposit();
				break;
				
			case 3:
				b1.withdraw();
				break;
			
			case 4:
				b1.creditInterest();
				break;
				
			case 5:
				b1.showDetails();
				break;
				
			case 6: return;

			}
		}
		while(ch!=6);		
		
	}
}
