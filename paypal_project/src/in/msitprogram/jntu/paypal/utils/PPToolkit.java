/**
 * 
 */
package in.msitprogram.jntu.paypal.utils;
import java.util.*;
/**
 * @author pg
 *
 */
public class PPToolkit {

	public static String generateActivationCode() 
	{
		Random rand = new Random();
		int  n = rand.nextInt(100000) + 10000;
		System.out.print(n);
	    return String.valueOf(n);
	}

	public static void sendActivationCode(String phone) 
	{
		
	}

}
