package BankATM;

import java.util.Scanner;

public class BankOperations
{

	public static int money;
	public void bankOptionChecker()
	{
		while(true)
		{
		System.out.println("Enter the actions to be performed");
		System.out.println("1:DEPOSIT,2:WITHDRAWAL,3:BALANCECHECK");
		int option;
		Scanner n = new Scanner(System.in);
		option = n.nextInt();
		
		if (option==1)
				{
					System.out.println("Enter the money to be deposited");
					int money = n.nextInt();
					Deposit(money);
				}
		else if(option==2)
		{
			System.out.println("Enter the money to be withdraw");
			int money = n.nextInt();
			Withdraw(money);
		}
		
		else if(option==3)
		{
			
		
		}
		}
	}
	private void Withdraw(int money2)
	{
		if (money>money2)
		{
		money = money-money2;
		System.out.println("Money withdrawn" + money);
		}
		else 
		{
			System.out.println("Insufficient balance");
		}
	}
	private void Deposit(int sum)
	{
		money = money+sum;
		System.out.println("Money deposited");
	}
	}

