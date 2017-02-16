package BankATM;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pincode {

	Map<Integer,Integer> accandpindetails = new HashMap<Integer,Integer>();
	
	public void storingaccnpininMap(int accNum,int pin)
	
	{
		int numberofaccountholders = numberofaccholdercalculator();
		Scanner two = FileReader();
		int pincodeVerifier = 0;
		int accNumVerifier=0;
		
		for (int i=1;i<numberofaccountholders+1;i++)
		{
			accNumVerifier = two.nextInt();
			pincodeVerifier = two.nextInt();
			accandpindetails.put(accNumVerifier, pincodeVerifier);
			
		}
		
		pinandAccountVerifier(accNum, pin);
		
		
	}


	private void pinandAccountVerifier(int accNum, int pin) 
	{
		int count =0;
		if(accandpindetails.containsKey(accNum))
		{
			int pincodefrommap = accandpindetails.get(accNum);
			if (pincodefrommap==pin)
			{
				System.out.println("PASS");
				BankOperations bp = new BankOperations();
				bp.bankOptionChecker();
				
			}
			else
			{
				System.out.println("Pin code is not correct");
			}
		}
		else
		{
			System.out.println("Acc number is not valid");
		}
	}


	

	
	public int numberofaccholdercalculator()
	{
		Scanner two = FileReader();
		
		int lines=0;
		while(two.hasNextLine())
		{
			lines++;
			two.nextLine();
		}
		two.close();
		int numberofaccountholders=lines;
		return lines;
		
	}
	
	private Scanner FileReader() {
		File file = new File("C:\\myfileforJava\\accholderinfo.txt");
		Scanner two = null;
		try 
			{
				two = new Scanner(file);
			}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(0);
		}
		return two;
	}


	
	

}