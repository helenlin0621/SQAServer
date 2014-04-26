import java.awt.Image;
import java.util.LinkedList;
/**  �ж������ɦ^�Ǹ�� �H�ΧR���ж����D     **/
public class Room 
{
	//
	int roomNum;
	private ChessBoard chessBoard;
	private String player0UserToken;
	private String player1UserToken;
	private int nowPlay = 0;
	
	private LinkedList<String> chatMsg = new LinkedList<String>();
	
	public Room(int roomNum,String player0UserToken,String player1UserToken) 
	{
		this.roomNum = roomNum;
		this.chessBoard = new ChessBoard( 10 , 9 ); /**  ��ӴѽL���P  **/
		this.player0UserToken = player0UserToken;
		this.player1UserToken = player1UserToken;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public String getPlayer0UserToken() {
		return player0UserToken;
	}
	public String getPlayer1UserToken() {
		return player1UserToken;
	}
	private void changePlayer() //���ܲ{�b���a
	{
		nowPlay = ( nowPlay + 1 ) % 2;
	}
	
	
	public boolean moveChess(String UserToken,int xOfStart,int yOfStart,int xOfEnd,int yOfEnd)//�^�ǫ��A�ܤ�
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
	public int[][] updateChessBoardInfo(String UserToken) /** �P�B��T���D   **/
	{
		//��@ updateChessBoardInfo ��D�Ӫ��a�ɤ��n���L��s�ѽL (�����ݰʧ@)
		return chessBoard.getChessBoard();
	}
	
	
	public boolean chat(String UserToken,String msg)/** �P�B��T���D   **/
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
	public ChessBoard(int length, int width) /**   �ѽL��l �|����@      **/
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
class Player
{
	private String userToken;
	private Image picture;
	private int win,lose;
	
	public String getUserToken() {
		return userToken;
	}
	public Image getPicture() {
		return picture;
	}
	public int getWin() {
		return win;
	}
	public int getLose() {
		return lose;
	}
	
}
