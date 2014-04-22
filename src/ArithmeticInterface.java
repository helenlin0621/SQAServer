//*******************************************************************
//*  Network Programming - Unit 6 Remote Method Invocation          *
//*  Program Name: ArithmeticInterface                              *
//*  The program defines the interface for Java RMI.                *
//*  2014.02.26                                                     *
//*******************************************************************
import java.rmi.Remote;

public interface ArithmeticInterface extends Remote
{
	public void append(String receiveMag) throws java.rmi.RemoteException;
	public void query(String receiveMag) throws java.rmi.RemoteException;
	public void delete(String receiveMag) throws java.rmi.RemoteException;
}

