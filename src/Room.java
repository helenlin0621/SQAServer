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
		this.chessBoard = new ChessBoard( 10 , 9 ); /*****��ӴѽL���P*****/
		this.player0UserToken = player0UserToken;
		this.player1UserToken = player1UserToken;
	}
	private boolean changePlayer() //���ܲ{�b���a
	{
		nowPlay = ( nowPlay + 1 ) % 2;
		return true;
	}
	
	
	public boolean moveChess(String UserToken,int xOfStart,int yOfStart,int xOfEnd,int yOfEnd)
	{
		boolean ActionSuccess = false ;
		
		//��@ moveChess 
		return ActionSuccess;
	}
	public boolean openChess(String UserToken,int x,int y)
	{
		boolean ActionSuccess = false ;
		//��@ openChess
		return ActionSuccess;
	}
	public int[][] getChessBoard(String UserToken) 
	{
		//��@ updateChessBoardInfo ��D�Ӫ��a�ɤ��n���L��s�ѽL (�����ݰʧ@)
		return chessBoard.getChessBoard();
	}
	
	
	public boolean chat(String UserToken,String msg)
	{
		boolean ActionSuccess = false ;
		//��@ chat ��Y�@�誱�a�ϥΦ�method �ݳq���t�@�誱�a��s
		return ActionSuccess;
	}
}
class ChessBoard
{
	private int length ;
	private int width ;
	private int[][] chessBoard ;
	public ChessBoard(int length, int width) /***** �ѽL��l �|����@ *****/
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