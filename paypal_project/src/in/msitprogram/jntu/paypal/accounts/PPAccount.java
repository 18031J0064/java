package in.msitprogram.jntu.paypal.accounts;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import in.msitprogram.jntu.paypal.utils.PPToolkit;

public class PPAccount implements Serializable
{
	/**
	 * 
	 */
	private Profile profile;
	private String email;
	private float accountBal;
	private boolean isActivated;
	private String activationCode;
	private ArrayList<Transaction> transactions;
	private PPAccount account;
	private float intial;
	private String bname;
	private String parentmail;
	private int type;
	public PPAccount(Profile profile)
	{
		this.profile=profile;
	}

	public String toString()
	{
		
		return null;
	}

	public void activate(String activationCode) 
	{
		this.activationCode=activationCode;

		// TODO Auto-generated method st
		
	}
	public String getactivate()
	{
		return activationCode;
	}
	
	public void suspend(){
	
		// TODO Auto-generated method stub
	}


	public boolean withdraw(float withdrawAmount) {
		
		return false;
	}


	public boolean addFunds(float creditAmount) 
	{
		
		return false;
	}
	
	public boolean sendMoney(float creditAmount) 
	{
		
		return false;
	}
	
	public boolean requestMoney(float creditAmount) 
	{
		
		return false;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}

	public String getEmail()
	{
		return email;
	}
	public void setdate(String d)
	{
		 String dob = d;
	}
	public void getdate(String d)
	{
     System.out.println(d);
	}
	public void setpan(String p)
	{
		String pan = p;
	}	
	public void getpan(String p)
	{
     System.out.println(p);
	}
	public void setintial(float i)
	{
		intial=i;
	}	
	public float getintial()
	{
		return intial;
	}

	public void setstatus(boolean status)
	{
		isActivated=status;
	}
	public boolean getstatus()
	{
		return isActivated;
	}
	public void setbname(String b)
	{
		String bname=b;
	}
	public void getbname()
	{
		System.out.println(bname);
	}
	public void setparentmail(String pmail)
	{
		String parentmail=pmail;
	}
	public void getparentmail()
	{
		System.out.println(parentmail);
	}
	public void settype(int t)
	{
		int type=t;
	}
	public int gettype()
	{
		System.out.println(type);
		return type;
	}
}
