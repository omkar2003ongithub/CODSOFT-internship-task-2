// Title : CODSOFT INTERNSHIP TASK 2 (ATM INTERFACE)
// Author : Omkar Ajit Vartak

import java.util.*;
import java.util.Scanner.*;

class User_account
{
	 public static double bal = 30500.74;
}
public class ATM_machine extends User_account
{
	public static void withdraw()
	{
		double amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to Withdraw : ");
		amount = sc.nextDouble();
		if(amount>bal)
		{
			System.out.println("\n\t Your account does not have sufficient balance to withdraw the required amount..");
			System.out.println("\n\t Check your Balance and confirm..");
		}
		else
		{
			bal = bal-amount;
			System.out.println("\n\t Withdrawal Has been Sucssessful your available balance is : "+bal);
		}
		sc.close();
	}
	public static void deposit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to Deposit : ");
		double amount = sc.nextDouble();
		bal = bal+amount;
		System.out.println("\n\t Amount Depostited Successfully...");
		System.out.println("\n\t Avaibalbe balance is : "+bal);
		sc.close();
	}
	public static void checkBalance()
	{
		System.out.println("\n\t welcome Customer..."); 
		System.out.println("\n\t Available balance is  : "+bal);
		System.out.println("\n\t Thank you visit again...");
	}
	public static void main(String[] args) throws Exception
	{
		int ch;
		Scanner sc1 = new Scanner(System.in);
		
			System.out.println("\n\t Welcome to XYZ Bank.....");
			System.out.println("\n\t Welcome to your account...");
			System.out.println("\n\t 1.Mini Statement; \n\t 2.Withdraw; \n\t 3. Deposit; \n\t 4. Exit ");
			System.out.println("Enter Your choice : ");
			ch = sc1.nextInt();
			switch(ch)
			{
			case 1 :
				System.out.println("\n\t 1. MINI STATEMENT");
				checkBalance();
				break;
			case 2 :
				System.out.println("\n\t 2. WITHDRAW");
				withdraw();
				break;
			case 3 :
				System.out.println("\n\t 3. DEPOSIT");
				deposit();
				break;
			case 4 :
				System.out.println("Exit from the account");
				break;
			default :
				System.out.println("\n\t Invalid Choice");
			}
		
			
	}
		
	
}
