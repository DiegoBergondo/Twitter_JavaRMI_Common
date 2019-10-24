package twitter_javarmi_common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CallbackUsuarioInterface extends Remote{
	
	public String notificarTrino(String trino) throws RemoteException;

	public void setNick(String nick) throws RemoteException;
	
	public String getNick() throws RemoteException;
	
}
