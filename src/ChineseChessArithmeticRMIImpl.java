//*******************************************************************
//*  Network Programming - Unit 6 Remote Method Invocation          *
//*  Program Name: ArithmeticRMIImpl                                *
//*  The program implements the services defended in the interface, *
//*    ArithmeticInterface.java, for Java RMI.                      *
//*  2014.02.26                                                      *
//*******************************************************************
import java.rmi.*;
import java.rmi.server.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.LinkedList;


public class ChineseChessArithmeticRMIImpl extends UnicastRemoteObject implements ChineseChessArithmeticInterface
{
	
	private int roomNum = 0;
	private LinkedList<Room> roomlist = new LinkedList<Room>();
	private LinkedList<String> waitingPlayer = new LinkedList<String>();/**    �κA�n��L?    **/
	
	
	private LinkedList<Player> online = new LinkedList<Player>();//�����C�Ӫ��a�ݩ���өж�
	
	// This implementation must have a public constructor.
	// The constructor throws a RemoteException.
	public ChineseChessArithmeticRMIImpl() throws java.rmi.RemoteException
	{
		super(); 	// Use constructor of parent class
	}
		
	// Implementation of the service defended in the interface
	public String check(String APIToken,String SecretToken)
	{
		String startTime = getDateTime();
		return startTime;
	}
	private String getDateTime()
	{
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Date date = new Date();
		String strDate = sdFormat.format(date);
		return strDate;
	}
	/**  �߰ݪ��a�O�_�P�N?   **/
	public int connect(String UserToken)//�H���t��
	{
		String rivalToken="";//�H����M���ݪ��a�M�椤���H
		
		Room room = new Room(roomNum,UserToken,rivalToken);
		roomNum ++;
		roomlist.add(room);
		
		waitingPlayer.remove(rivalToken);
		
		//���@��RoomNumber
		return roomNum;
	}
	public int connect(String UserToken,String rivalToken)//��ܪ��a    �U�@���P�N �_�u�B�z
	{
		Room room = new Room(roomNum,UserToken,rivalToken);
		roomNum ++;
		roomlist.add(room);
		
		waitingPlayer.remove(rivalToken);
		
		//���@��RoomNumber
		return roomNum;
	}
	private int getRoomIndex(int roomNum)//����ڪ���}
	{
		int roomIndex = -1 ;
		return roomIndex;
	}
	
	//�H�U���g����methoud
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
	public int[][] updateChessBoardInfo(int roomNum,String UserToken) 
	{
		return roomlist.get(getRoomIndex(roomNum)).updateChessBoardInfo(UserToken);
	}
	
	public boolean chat(int roomNum,String UserToken,String msg)
	{
		boolean ActionSuccess = false ;
		ActionSuccess = roomlist.get(getRoomIndex(roomNum)).chat(UserToken, msg);
		return ActionSuccess;
	}
		
	
}
