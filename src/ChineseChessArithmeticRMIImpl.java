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
	
	private int roomNum = 0;
	private LinkedList<Room> roomlist = new LinkedList<Room>();
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
		String rivalToken="";
		
		Room room = new Room(roomNum,UserToken,rivalToken);
		roomNum ++;
		roomlist.add(room);
		
		waitingPlayer.remove(rivalToken);
		
		//給一個RoomNumber
		return roomNum;
	}
	public int connect(String UserToken,String rivalToken)//選擇玩家
	{
		Room room = new Room(roomNum,UserToken,rivalToken);
		roomNum ++;
		roomlist.add(room);
		
		waitingPlayer.remove(rivalToken);
		
		//給一個RoomNumber
		return roomNum;
	}
	private int getRoomIndex(int roomNum)//找到實際的位址
	{
		int roomIndex = -1 ;
		return roomIndex;
	}
	
	//以下為寫完的methoud
	public boolean moveChess(int roomNum,String UserToken,int xOfStart,int yOfStart,int xOfEnd,int yOfEnd)
	{
		boolean ActionSuccess = false ;
		ActionSuccess = roomlist.get(getRoomIndex(roomNum)).moveChess(UserToken,xOfStart, yOfStart, xOfEnd, yOfEnd);
		return ActionSuccess;
	}
	public boolean openChess(int roomNum,String UserToken,int x,int y)
	{
		boolean ActionSuccess = false ;
		ActionSuccess = roomlist.get(getRoomIndex(roomNum)).openChess(UserToken,x, y);
		return ActionSuccess;
	}
	public int[][] updateChessBoardInfo(int roomNum) 
	{
		return roomlist.get(getRoomIndex(roomNum)).getChessBoard();
	}
		
	
}
