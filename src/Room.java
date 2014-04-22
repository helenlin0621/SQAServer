public class Room 
{
	int roomNum;
	private ChessBoard chessBoard;
	private String player0UserToken;
	private String player1UserToken;
	private int nowPlay = 0;
	
	public Room(int roomNum,String player0UserToken,String player1UserToken) 
	{
		this.roomNum = roomNum;
		this.chessBoard = new ChessBoard( 10 , 9 );
		this.player0UserToken = player0UserToken;
		this.player1UserToken = player1UserToken;
	}
	private boolean changePlayer()
	{
		nowPlay = ( nowPlay + 1 ) % 2;
		return true;
	}
	
	
	public boolean moveChess(String UserToken,int xOfStart,int yOfStart,int xOfEnd,int yOfEnd)
	{
		boolean ActionSuccess = false ;
		return ActionSuccess;
	}
	public boolean openChess(String UserToken,int x,int y)
	{
		boolean ActionSuccess = false ;
		return ActionSuccess;
	}
	public int[][] getChessBoard() 
	{
		return chessBoard.getChessBoard();
	}
	
}
class ChessBoard
{
	private int length ;
	private int width ;
	private int[][] chessBoard ;
	public ChessBoard(int length, int width) 
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