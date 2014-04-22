import java.util.LinkedList;

public class Room 
{
	int roomNum;
	private ChessBoard chessBoard;
	private String player0UserToken;
	private String player1UserToken;
	private int nowPlay = 0;
	
	private LinkedList<String> chatMsg = new LinkedList<String>();
	
	public Room(int roomNum,String player0UserToken,String player1UserToken) 
	{
		this.roomNum = roomNum;
		this.chessBoard = new ChessBoard( 10 , 9 ); /*****兩個棋盤不同*****/
		this.player0UserToken = player0UserToken;
		this.player1UserToken = player1UserToken;
	}
	private boolean changePlayer() //改變現在玩家
	{
		nowPlay = ( nowPlay + 1 ) % 2;
		return true;
	}
	
	
	public boolean moveChess(String UserToken,int xOfStart,int yOfStart,int xOfEnd,int yOfEnd)
	{
		boolean ActionSuccess = false ;
		
		//實作 moveChess 
		return ActionSuccess;
	}
	public boolean openChess(String UserToken,int x,int y)
	{
		boolean ActionSuccess = false ;
		//實作 openChess
		return ActionSuccess;
	}
	public int[][] getChessBoard(String UserToken) 
	{
		//實作 updateChessBoardInfo 當非該玩家時不要讓他更新棋盤 (做等待動作)
		return chessBoard.getChessBoard();
	}
	
	
	public boolean chat(String UserToken,String msg)
	{
		boolean ActionSuccess = false ;
		//實作 chat 當某一方玩家使用此method 需通知另一方玩家更新
		return ActionSuccess;
	}
}
class ChessBoard
{
	private int length ;
	private int width ;
	private int[][] chessBoard ;
	public ChessBoard(int length, int width) /***** 棋盤初始 尚未實作 *****/
	{
		this.length = length;
		this.width = width;
		chessBoard = new int[length][width];
	}
	public int[][] getChessBoard() 
	{
		return chessBoard;
	}
	
}