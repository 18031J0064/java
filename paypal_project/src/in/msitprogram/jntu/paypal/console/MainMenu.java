/**
 * 
 */
package in.msitprogram.jntu.paypal.console;

import java.io.IOException;
import java.util.Scanner;

import in.msitprogram.jntu.paypal.accounts.PPAccount;
import in.msitprogram.jntu.paypal.persistance.DataStore;

/**
 * @author :D.Keerthi 18031J0064
 *
 */
public class MainMenu {
	
	public static void show() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Signup\n 2.Login\n 3.Exit\n");
		System.out.println("Enter Choice:");
		int ch=sc.nextInt();
		sc.nextLine();
		String email;
		switch(ch)
		{
			case 1:System.out.println("1.Signup\n");
					System.out.println("Enter email address:");
					 email=sc.nextLine();
					 if(DataStore.lookupAccount(email)!=null)
					 {
						 System.out.println("Already used email address"); 
						 MainMenu.show(); 
					 }
					 else
					 {
						 System.out.println("Signup account");
						 PPNewAccountScreen account=new PPNewAccountScreen(email);
						 account.show();
					 }
					break;
			case 2:System.out.println("2.Login\n");
					System.out.println("Enter email address:");
					email=sc.nextLine();
					if(DataStore.lookupAccount(email)!=null)
					{
						PPAccountScreen screen=new PPAccountScreen(email);
						screen.show();
					}
					else
					{
						System.out.println("Invalid email address\n Signup");
						MainMenu.show();
					}
					break;
			case 3:System.out.println("3.Exit\n");
					break;
			default:System.out.println("Enter your choice");
			
		}
		
	}

}
