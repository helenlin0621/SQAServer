//*******************************************************************
//*  Network Programming - Unit 6 Remote Method Invocation          *
//*  Program Name: ArithmeticRMIImpl                                *
//*  The program implements the services defended in the interface, *
//*    ArithmeticInterface.java, for Java RMI.                      *
//*  2014.02.26                                                      *
//*******************************************************************
import java.rmi.*;
import java.rmi.server.*;
import java.util.LinkedList;

public class ChineseChessArithmeticRMIImpl extends UnicastRemoteObject implements ChineseChessArithmeticInterface
{
	
	
	private LinkedList<ChessBoard> room = new LinkedList<ChessBoard>();
	private LinkedList<String> waitingPlayer = new LinkedList<String>();
	// This implementation must have a public constructor.
	// The constructor throws a RemoteException.
	public ChineseChessArithmeticRMIImpl() throws java.rmi.RemoteException
	{
		super(); 	// Use constructor of parent class
	}
		
	// Implementation of the service defended in the interface
	public ConnectMsg check(String APIToken,String SecretToken)
	{
		ConnectMsg connectMsg = new ConnectMsg();
		return connectMsg;
	}
	public int connect(String UserToken)//隨機配對
	{
		//給一個RoomNumber
		int roomNum = -1;
		return roomNum;
	}
	public int connect(String UserToken,String waitingPlayer)//選擇玩家
	{
		//給一個RoomNumber
		int roomNum = -1;
		return roomNum;
	}
	public boolean moveChess(int roomNum,int xOfStart,int yOfStart,int xOfEnd,int yOfEnd)
	{
		boolean ActionSuccess = false ;
		ActionSuccess = room.get(roomNum).moveChess(xOfStart, yOfStart, xOfEnd, yOfEnd);
		return ActionSuccess;
	}
	public boolean openChess(int roomNum ,int x,int y)
	{
		boolean ActionSuccess = false ;
		ActionSuccess = room.get(roomNum).openChess(x, y);
		return ActionSuccess;
	}
		
	
}
