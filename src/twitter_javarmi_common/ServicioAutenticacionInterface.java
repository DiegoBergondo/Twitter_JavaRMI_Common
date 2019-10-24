package twitter_javarmi_common;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServicioAutenticacionInterface extends Remote {

	public boolean registrar(String nick, String password, String nombre, String mail) throws RemoteException;
	
	public boolean autenticar(String nick, String password) throws RemoteException;
				
	public boolean usuarioEnMiLista(String nickAmigo, String nick) throws RemoteException;
		
	public String getNombre(String nick) throws RemoteException;
	
	public String getMail(String nick) throws RemoteException;
		
}