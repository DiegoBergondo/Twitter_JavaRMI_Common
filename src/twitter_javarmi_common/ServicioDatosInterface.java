package twitter_javarmi_common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ServicioDatosInterface extends Remote{
	
	public void añadirUsuario(String nick, String password, String nombre, String mail) throws RemoteException;
	
	public void añadirAmigo(String nickAmigo, String nick) throws RemoteException;
	
	public void eliminarAmigo(String nickAmigo, String nick) throws RemoteException;
	
	public void enviarTrino(String trino, String nickDe, String nickA) throws RemoteException;
	
	public List<Trino> recibir(String nick) throws RemoteException;
	
	public void limpiarBuffer(String nick) throws RemoteException;
	
	public boolean usuarioRegistrado(String nick) throws RemoteException;
	
	public boolean usuarioEnMiLista(String nickAmigo, String nickNombre) throws RemoteException;
	
	public List<String> amigos(String nick) throws RemoteException;
	
	public String getNombre(String nick) throws RemoteException;
	
	public String getMail(String nick) throws RemoteException;
	
	public String getPass(String nick) throws RemoteException;
	
}
