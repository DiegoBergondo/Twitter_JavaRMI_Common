package twitter_javarmi_common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ServicioGestorInterface extends Remote {
	  
	  public void registerForCallback(CallbackUsuarioInterface callbackClientObject) throws java.rmi.RemoteException;
	  
	  public void unregisterForCallback(CallbackUsuarioInterface callbackClientObject) throws java.rmi.RemoteException;
	  
	  public void nuevoTrino(String nick) throws java.rmi.RemoteException;

	  public boolean agregar(String amigo, String nick) throws RemoteException;
	  
	  public boolean eliminar(String amigo, String nick) throws RemoteException;

	  public boolean enviar(String mensage, String nickDe, String nickA) throws RemoteException;

	  public List<Trino> recibir(String nick) throws RemoteException;

	  public List<String> amigos(String nick) throws RemoteException;
}
