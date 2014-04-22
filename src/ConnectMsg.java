import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.crypto.Data;


public class ConnectMsg 
{
	private String token;
	private Data startTime;
	
	public ConnectMsg() 
	{
		//Creat a unique token and startTime
	}
	public String getToken() {
		return token;
	}
	public Data getStartTime() {
		return startTime;
	}
	
	
}
