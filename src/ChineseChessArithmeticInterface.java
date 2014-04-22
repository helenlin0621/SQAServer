//*******************************************************************
//*  Network Programming - Unit 6 Remote Method Invocation          *
//*  Program Name: ArithmeticInterface                              *
//*  The program defines the interface for Java RMI.                *
//*  2014.02.26                                                     *
//*******************************************************************
import java.rmi.Remote;

public interface ChineseChessArithmeticInterface extends Remote
{
	public ConnectMsg check(String APIToken,String SecretToken) throws java.rmi.RemoteException;
	
	public int connect(String UserToken) throws java.rmi.RemoteException;
	public int connect(String UserToken,String rivalToken) throws java.rmi.RemoteException;
	
	public boolean moveChess(int roomNum,String UserToken,int xOfStart,int yOfStart,int xOfEnd,int yOfEnd) throws java.rmi.RemoteException;
	public boolean openChess(int roomNum,String UserToken,int x,int y) throws java.rmi.RemoteException;
	public int[][] updateChessBoardInfo(int roomNum,String UserToken) throws java.rmi.RemoteException;
	
	public boolean chat(int roomNum,String UserToken,String msg) throws java.rmi.RemoteException;
	
	
	
}

