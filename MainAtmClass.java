package BankATM;

import java.io.File;
import java.util.Scanner;

public class MainAtmClass {

	public static void main(String[] args)
	{
		System.out.println("Please enter the PIN code");
		Scanner n = new Scanner(System.in);
		int accNum = n.nextInt(); 
		int pin = n.nextInt();
		Pincode pinchecker = new Pincode();
		pinchecker.storingaccnpininMap(accNum,pin);
		
	
	}

}
