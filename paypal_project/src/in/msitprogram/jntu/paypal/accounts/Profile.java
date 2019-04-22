package in.msitprogram.jntu.paypal.accounts;

import java.io.Serializable;

public class Profile implements Serializable {
	
	private String name;
	private String address;
	private String phone;
	public void setname(String n)
	{
     name=n;
	}
	public void getname(String n)
	{
     System.out.println(name);
	}
	public void setaddress(String a)
	{
		address=a;
	}
	public void getaddress(String a)
	{
     System.out.println(address);
	}
	public void setphone(String p)
	{
		phone=p;
	}
	public void getphone(String p)
	{
     System.out.println(phone);
	}
}

