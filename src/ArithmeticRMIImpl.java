//*******************************************************************
//*  Network Programming - Unit 6 Remote Method Invocation          *
//*  Program Name: ArithmeticRMIImpl                                *
//*  The program implements the services defended in the interface, *
//*    ArithmeticInterface.java, for Java RMI.                      *
//*  2014.02.26                                                      *
//*******************************************************************
import java.rmi.*;
import java.rmi.server.*;

public class ArithmeticRMIImpl extends UnicastRemoteObject implements ArithmeticInterface
{
	// This implementation must have a public constructor.
	// The constructor throws a RemoteException.
	public ArithmeticRMIImpl() throws java.rmi.RemoteException
	{
		super(); 	// Use constructor of parent class
	}
		
	// Implementation of the service defended in the interface
	public void append(String receiveMag) throws java.rmi.RemoteException
	{
	    
	}
		
	public void query(String receiveMag) throws java.rmi.RemoteException
	{
		
	}
		
	public void delete(String receiveMag) throws java.rmi.RemoteException
	{
		
	}
		
	
}