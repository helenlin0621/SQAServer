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
	public void check(String APIToken,String SecretToken)
	{
		
	}
	public int conect(String UserToken)
	{
		int roomNum = -1;
		return roomNum;
	}
	public boolean moveChess(int roomNum,int xOfStart,int yOfStart,int xOfEnd,int yOfEnd)
	{
		boolean ActionSuccess = false ;
		return ActionSuccess;
	}
	public boolean openChess(int roomNum ,int x,int y)
	{
		boolean ActionSuccess = false ;
		return ActionSuccess;
	}
		
	
}