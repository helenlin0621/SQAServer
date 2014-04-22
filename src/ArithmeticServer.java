//*******************************************************************
//*  Network Programming - Unit 6 Remote Method Invocation          *
//*  Program Name: ArithmeticServer                                 *
//*  The program is the RMI server. It binds the ArithmeticRMIImpl  *
//*    with name server.                                            *
//*  2014.02.26                                                     *
//*******************************************************************
import java.rmi.*;
import java.rmi.server.*;

public class ArithmeticServer
{
	// Bind ArithmeticServer and Registry
	public static void main(String args[])
	{
		//System.setSecurityManager(new RMISecurityManager());
		try
		{
			ArithmeticRMIImpl name = new ArithmeticRMIImpl();
			System.out.println("Registering ...");
			Naming.rebind("arithmetic", name);	// arithmetic is the name of the service
			System.out.println("Register success");
		}
		catch(Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}