//*******************************************************************
//*  Network Programming - Unit 6 Remote Method Invocation          *
//*  Program Name: ArithmeticInterface                              *
//*  The program defines the interface for Java RMI.                *
//*  2014.02.26                                                     *
//*******************************************************************
import java.rmi.Remote;

public interface ArithmeticInterface extends Remote
{
	public void check(String APIToken,String SecretToken) throws java.rmi.RemoteException;
	public int conect(String UserToken) throws java.rmi.RemoteException;
	public boolean moveChess(int roomNum,int xOfStart,int yOfStart,int xOfEnd,int yOfEnd) throws java.rmi.RemoteException;
	public boolean openChess(int roomNum ,int x,int y) throws java.rmi.RemoteException;
}

