package in.msitprogram.jntu.paypal.console;

import in.msitprogram.jntu.paypal.accounts.PPAccount;
import in.msitprogram.jntu.paypal.persistance.DataStore;
import in.msitprogram.jntu.paypal.utils.PPToolkit;

import java.io.IOException;
import java.util.Scanner;

public class PPAccountActivationScreen
{
	public static  void show(String email) throws Exception 
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		do
		{
			System.out.println("Enter email address:");
		String mail = sc.nextLine();      //change to get console input
		if(mail.equals(email))
		{
			System.out.println("email address is valid");
			i=1;
		}
		else
		{
			System.out.println("Incorrect email address\n Please enter valid email address");
		}
		}while(i==0);
		PPAccount account=DataStore.lookupAccount(email);
		if(account.getstatus())
		{
			MainMenu.show();

		}
		else
		{
			int i5=0;
			do
			{
			//System.out.println("Activation code is:");
			String activationCode=account.getactivate();
			System.out.println("Enter activation code:"+activationCode);
			String code=sc.nextLine();
			if(activationCode.equals(code))
			{
				
				System.out.println("Account is active");
				account.setstatus(true);
				DataStore.writeAccount(account);
				break;
			}
			else
			{
				System.out.println("Enter a proper code");
				i5++;
			}
			}while(i5<3);
			MainMenu.show();
		}
		
		/*
		 * TODOs
		 * fetch the account object using email address
		 * check if the account is suspended
		 * if suspended then activate it
		 * if activation code invalid, retry for 2 more attempts
		 * on successful activation show main menu
		 * on failure show the error message and continue to main menu
		 */				
		
		//PPAccount account = DataStore.lookupAccount(email);
		
		//check if account is active. if yes then ask for suspending it
		
		// if yes suspend it if not go back to main menu
		
		// accept activation code, check if valid, if not give 2 more attempts
		
		//proceed to main menu
		MainMenu.show();
	
	}

	private static void lookupAccount(String email) {
		// TODO Auto-generated method stub
		
	}

	

	

}