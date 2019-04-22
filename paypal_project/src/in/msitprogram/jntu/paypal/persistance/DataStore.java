package in.msitprogram.jntu.paypal.persistance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;

import in.msitprogram.jntu.paypal.accounts.PPAccount;
import in.msitprogram.jntu.paypal.accounts.PPRestrictedAccount;

public class DataStore
{
	
	public static PPAccount lookupAccount(String email) throws Exception 
	{
		PPAccount account = null; //initialize it after reading from file
		// write code to open the files, read
		try
		{
			FileInputStream fin=new FileInputStream("D:\\project.txt");
			ObjectInputStream oi=new ObjectInputStream(fin);
			 Vector<PPAccount> v=(Vector<PPAccount>)oi.readObject();
			for(int i=0;i<v.size();i++)
			{
				account=v.get(i);
				System.out.println("Enter email address:"+account.getEmail());
				if(account.getEmail().equals(email))
					return account;
			}
			oi.close();
			fin.close();
		}
		catch(Exception e)
		{
		}
		return null;
	}
	public static void writeAccount(PPAccount account) throws Exception
	{
		Vector<PPAccount>v=new Vector<PPAccount>();
		try
		{
			FileInputStream fin=new FileInputStream("D:\\project.txt");
			ObjectInputStream oi=new ObjectInputStream(fin);
			 v=(Vector<PPAccount>)oi.readObject();
			 oi.close();
			 fin.close();
		}
		catch(Exception e)
		{
		}
		for(int i=0;i<v.size();i++)
		{
			if(account.getEmail().equals(v.get(i).getEmail()))
			{
				v.remove(v.get(i));
		}
		}
		try
		{
			FileOutputStream fos=new FileOutputStream("D:\\project.txt");
			ObjectOutputStream os=new ObjectOutputStream(fos);
			v.add(account);
			os.writeObject(v);	 
			System.out.println("data writed");
			os.close();
			fos.close();
		} 
		catch (Exception e)
		{
			//e.printStackTrace();
		}
	}
	
}
